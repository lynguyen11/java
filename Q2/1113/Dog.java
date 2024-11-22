import java.awt.Graphics;
import java.awt.Color;

public class Dog{
    private int x;
    private int y;
    private Color brown = new Color(210, 184, 140);
    private int direction = 1; //1 right, 2 left, 3 up, 4 down

    public Dog(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void drawMe(Graphics g){
        g.setColor(brown);
        g.fillOval(x, y, 30, 20);
        g.fillOval(x + 20, y - 7, 15, 15);
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
            x = 35;
        }
        if(y > 600 || y < 450){
            y = 450;
        }
    }
}