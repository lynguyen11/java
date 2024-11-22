import java.awt.Color;
import java.awt.Graphics;


public class Player{

    private int x;
    private int y;
    private Color blue = new Color(60, 40, 230);

    public Player(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void drawMe(Graphics g){
        g.setColor(blue);
        g.fillOval(x, y, 30, 30);
    }

    public void moveRight(){
        x++;
    }

    public void moveLeft(){
        x--;
    }

    public void moveUp(){
        y++;
    }

    public void moveDown(){
        y--;
    }
}