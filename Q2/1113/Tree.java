import java.awt.Graphics;
import java.awt.Color;

public class Tree{
    private int x;
    private int y;
    private Color green = new Color(110, 186, 124);
    private Color brown = new Color(77, 53, 30);
    
    public Tree(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void drawMe(Graphics g){
        g.setColor(brown);
        g.fillRect(x + 10, y + 15, 10, 30);
        
        g.setColor(green);
        g.fillOval(x, y, 30, 30);
    }
}