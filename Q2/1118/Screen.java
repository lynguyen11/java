import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class Screen extends JPanel implements KeyListener{

    private Player p1;

    public Screen(){
        p1 = new Player(100, 100);

        addKeyListener(this);
        setFocusable(true);
    }

	public Dimension getPreferredSize() {
		//Sets the size of the panel
        return new Dimension(800,600);
	}
	
	public void paintComponent(Graphics g) {
        super.paintComponent(g);

        p1.drawMe(g);

	} 

    public void keyPressed(KeyEvent e){
        System.out.println("Key: " + e.getKeyCode());
        if(e.getKeyCode() == 39){
            p1.moveRight();
        }
        

        repaint();
    }
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
}
