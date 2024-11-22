import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;


public class Screen extends JPanel {

    private Tree[] myTrees;
  	private Cloud[] myClouds;
    private Color blue = new Color(178, 203, 247);
    private Color ground = new Color(74, 128, 68);
  	private Grass[] plant;
    private Dog myDog;
    private Bird[] myBird;
    
    public Screen(){
        myTrees = new Tree[100];
        for(int i = 0; i < myTrees.length; i++){
            int x = (int)(Math.random() * 771);
            int y = (int)(Math.random() * 271 + 250);
            myTrees[i] = new Tree(x, y);
        }
      	myClouds = new Cloud[7];
        for(int i = 0; i < myClouds.length; i++){
            int x = (int)(Math.random() * 771);
            int y = (int)(Math.random() * 150);
            myClouds[i] = new Cloud(x, y);
        }
      	plant = new Grass[150];
        for(int i = 0; i < plant.length; i++){
            int x = (int)(Math.random() * 796 + 5);
            int y = (int)(Math.random() * 271 + 250);
            plant[i] = new Grass(x, y);
        }
        myDog = new Dog(100, 460);
        myBird = new Bird[5];
        myBird[0] = new Bird(((int)(Math.random() * 771 + 30)), ((int)(Math.random() * 421 + 30)));
        myBird[1] = new Bird(((int)(Math.random() * 771 + 30)), ((int)(Math.random() * 421 + 30)));
        myBird[2] = new Bird(((int)(Math.random() * 771 + 30)), ((int)(Math.random() * 421 + 30)));
        myBird[3] = new Bird(((int)(Math.random() * 771 + 30)), ((int)(Math.random() * 421 + 30)));
        myBird[4] = new Bird(((int)(Math.random() * 771 + 30)), ((int)(Math.random() * 421 + 30)));
    }

	@Override
	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);

        g.setColor(blue);
        g.fillRect(0, 0, 800, 600);

        g.setColor(ground);
        g.fillRect(0, 250, 800, 350);

        for(int i = 0; i < myTrees.length; i++){
            myTrees[i].drawMe(g);
        }
      	for(int i = 0; i < myClouds.length; i++){
            myClouds[i].drawMe(g);
        }
      	for(int i = 0; i < plant.length; i++){
            plant[i].drawMe(g);
        }

        myDog.drawMe(g);
        myBird[0].drawMe(g);
        myBird[1].drawMe(g);
        myBird[2].drawMe(g);
        myBird[3].drawMe(g);
        myBird[4].drawMe(g);
	}

    public void animate(){
        while( true ){
            //Write code to move each cloud
            //Use a for loop that goes through the clouds array
            //Call move for each cloud.  (e.g.  clouds[i].move() )
            for(int i = 0; i<myClouds.length; i++){
                myClouds[i].move();
            }
            
            myDog.move();
            myBird[0].move();
            myBird[1].move();
            myBird[2].move();
            myBird[3].move();
            myBird[4].move();
    
            //slow it down
            try{
                Thread.sleep(10); //milliseconds
            } catch (InterruptedException ex){
                Thread.currentThread().interrupt();
            }
    
            repaint(); //refreshes the screen
        }
    }

}
