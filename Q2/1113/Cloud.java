import java.awt.Graphics;
import java.awt.Color;

public class Cloud {
    private int x;
    private int y;
    private Color gray = new Color(160, 160, 160);

    public Cloud(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void drawMe(Graphics g) {
        g.setColor(gray);
        g.fillOval(x, y, 50, 20);
        g.fillOval(x, y, 50, 20);
    }

    public void move(){
        x++;
        if (x > 800){
            x = 50;
        }
    }
}
