import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;


public class Screen extends JPanel {

    private Color yellow;
    private Color green;
    private Color blue;
    private Color white;
    private Color brown;
    private int sunY;
    private int cloudX;

    public Screen(){
        yellow = new Color (255, 255, 0);
        green = new Color (0, 255, 0);
        blue = new Color (149, 220, 252);
        white = new Color (245, 251, 255);
        brown = new Color (105, 72, 46);
        sunY = 500;
        cloudX = -50;
    }

	@Override
	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);

        drawSky(g);
        drawSun(g);
        cloud(g);
        drawBackground(g);
        drawGrass(g);
        tree(g);
	}

    //clouds
    public void cloud(Graphics g){
        g.setColor(white);
        g.fillOval(cloudX, 100, 50, 30);
        g.fillOval(cloudX + 10, 110, 50, 30);
        g.fillOval(cloudX - 15, 105, 50, 30);
        g.fillOval(cloudX -5, 115, 50, 30);

        g.fillOval(cloudX + 100, 100, 50, 30);
        g.fillOval(cloudX + 110, 110, 50, 30);
        g.fillOval(cloudX + 85, 105, 50, 30);
        g.fillOval(cloudX + 95, 115, 50, 30);
    }

    //tree
    public void tree(Graphics g){
        int x = 50;
        g.setColor(brown);
        g.fillRect(x, 350, 50, 100);
        g.setColor(green);
        g.fillOval(x - 25, 280, 100, 100);
        while (x < 600){
            x += 130;
            g.setColor(brown);
            g.fillRect(x, 350, 50, 100);
            g.setColor(green);
            g.fillOval(x - 25, 280, 100, 100);
        }
    }

    //sky
    public void drawSky(Graphics g){
        g.setColor(blue);
        g.fillRect(0, 0, 800, 600);
    }

    //background
    public void drawBackground(Graphics g){
        g.setColor(green);
        g.fillRect(0, 410, 800, 390);
    }
    
    //draw sun
    public void drawSun(Graphics g){
        g.setColor(yellow);
        g.fillOval(10, sunY, 50, 50);
    }

    //draw grass
    public void drawGrass(Graphics g){
        g.setColor(green);

        int count = 1;
        int x = 10;
        while (count <= 112){
            g.fillRect(x, 400, 5, 20);
            x += 7;
            count++;
        }
    }

    public void animate(){
        while (true){
            //decrease sunY to make it move up
            sunY--;

            //increase cloudX to make it move right
            cloudX++;

            //repeat cloud movements
            if(cloudX > 800){
                cloudX = -110;
            }

            //repeat sun's movements
            if(sunY < -50){
                sunY = 600;
            }

            //slow frames down
            try{
                Thread.sleep(10); //milliseconds
            }
            catch (InterruptedException ex){
                Thread.currentThread().interrupt();
            }

            //refresh screen
            repaint();
        }
    }

}
