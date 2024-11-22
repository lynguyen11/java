//Screen class
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

public class Screen extends JPanel {

	private Color green = new Color(117, 207, 101);
  	private Color darkerGreen = new Color(81, 145, 96);
  	private Color skyBlue = new Color(156, 221, 247);
  	private Color orange = new Color(255, 180, 82);
  	private Color brown = new Color(219, 161, 123);
    private Color white = new Color(255, 255, 255);
  	private Color yellow = new Color(255, 255, 0);
  	private Color gray = new Color(140, 140, 140);
    private Color black = new Color(10, 10, 20);
    private Color night = new Color(34, 40, 48);
  	private int sunY = 10;
  	private boolean day = true;
    private int aniX;

	@Override
	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
        
        if(day==true){
            g.setColor(skyBlue);
        }
        else{
            g.setColor(night);
        }
        g.fillRect(0, 0, 800, 600);
        drawSun(g);
        drawBackground(g);
      
		int grassX = 0;
		int grassY = 400;
		for(int i=1; i<=15; i++){
			for(int j=1; j<=170; j++){
				drawGrass(g, grassX, grassY);
				grassX += 5;
			}
			grassX = 0;
			grassY += 13;
		}
    
    //trees
    	int treeX=15;
    	int treeY = 375;
    	for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                drawTrees(g, treeX, treeY);
                treeX += 30;
            }
        treeX = 15;
        treeY += 40;
      	}
  
    //pumpkins
  		int pumpX = 400;
    	int pumpY = 380;
    	for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                drawPumpkins(g, pumpX, pumpY);
                pumpX += 30;
            }
        pumpX = 400;
        pumpY += 30;
        }

        aniX = 100;
        drawAnimal(g, aniX, 500);

    }
  
  //drawing methods
  	public void drawBackground(Graphics g){
      	g.setColor(skyBlue);
    	g.fillRect(0, 0, 800, 600);
    
    	g.setColor(darkerGreen);
    	g.fillRect(0, 410, 800, 390);
    }
  
    public void drawPumpkins(Graphics g, int x, int y){
        g.setColor(green);
        g.fillRect(x, y - 5, 5, 15);
        g.setColor(orange);
        g.fillOval(x - 10, y, 10, 20);
        g.fillOval(x - 5, y, 10, 20);
        g.fillOval(x, y, 10, 20);
        g.fillOval(x + 5, y, 10, 20);
        g.fillOval(x + 10, y, 10, 20);
    }
		
    public void drawGrass(Graphics g, int x, int y){
        g.setColor(green);
        g.fillRect(x, y, 3, 10);
    }
    public void drawTrees(Graphics g, int x, int y){
        g.setColor(green);
        g.fillOval(x-6, y-10,20,20);
        g.setColor(orange);
        g.fillRect(x, y, 5, 18);
    }

    public void drawSun(Graphics g){
        if (day==false){
            g.setColor(gray);
        }
        else{
            g.setColor(yellow);
        }
        g.fillOval(30, sunY, 30,30);
    }

    public void drawAnimal(Graphics g, int x, int y){
        g.setColor(black);
        g.fillRect(x - 5, y + 10, 5, 7);
        g.fillRect(x + 5, y + 10, 5, 7);
        g.setColor(white);
        g.fillOval(x, y, 10, 10);
        g.fillOval(x + 5, y + 3, 10, 10);
        g.fillOval(x - 5, y - 5, 10, 10);
        g.fillOval(x - 10, y + 5, 10, 10);
        g.fillOval(x - 7, y + 3, 10, 10);
        g.fillOval(x - 10, y - 3, 10, 10);
        g.fillOval(x + 7, y - 5, 10, 10);
        g.fillOval(x + 5, y - 5, 10, 10);
        g.setColor(black);
        g.fillOval(x + 10, y, 10, 15);
    }

    public void animate(){
        while (true){
            sunY--;
          	if(sunY <= -30){
              	sunY = 500;
                day = !day;
            }

          	//animal moving -- add part with day/night time to start/stop movement
          	aniX++;
          	if(aniX >= 810){
              aniX = -10;
            }
          	if(day == false){
              aniX--;
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