import java.awt.Graphics;
import java.awt.Color;

public class Grass{
    
    private int x;
    private int y;
    private Color green = new Color(94, 189, 120);

    public Grass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void drawMe(Graphics g) {
        g.setColor(green);
        g.fillRect(x, y, 5, 20);
    }
}