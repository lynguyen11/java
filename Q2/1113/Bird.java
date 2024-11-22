import java.awt.Graphics;
import java.awt.Color;

public class Bird{
    private int x;
    private int y;
    private Color blue = new Color(64, 80, 247);
    private Color orange = new Color(247, 144, 64);
    private int direction = 1; //1 right, 2 left, 3 up, 4 down

    public Bird(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void drawMe(Graphics g){
        g.setColor(orange);
        g.fillRect(x, y, 10, 5);
        g.setColor(blue);
        g.fillOval(x - 5, y - 2, 10, 10);
        g.fillOval(x - 15, y + 5, 20, 10);
    }

    public void move(){
        int rand = (int)(Math.random() * 10 + 1);
        if (rand == 1){
            //change direction//random number from 1-4
            //change direction
            direction = (int)(Math.random() * 4 + 1);
        }
        
        if(direction == 1){
            x++;
        }
        else if (direction == 2){
            x--;
        }
        else if (direction == 3){
            y++;
        }
        else if (direction == 4){
            y--;
        }
        if(0 > x || x > 800){
            x = (int)(Math.random() * 771 + 30);
        }
        if(y > 400 || y < 0){
            y = (int)(Math.random() * 421 + 30);
        }
    }
}