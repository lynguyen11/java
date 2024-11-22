import java.awt.*;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SlotMachine{

    private Color dBrown = new Color(36, 32, 30);
    private Color brown = new Color(224, 173, 139);
    private Color lBrown = new Color(250, 224, 202);
    private Color nBrown = new Color(92, 61, 36);
    private Color bBrown = new Color(204, 156, 124);
    private Color dRed = new Color(128, 61, 45);
    private Color red = new Color(255, 30, 30);

    private Font font = new Font("Arial", Font.PLAIN, 50);
    private Font smol = new Font("Arial", Font.PLAIN, 20);
    private Font smoller = new Font("Arial", Font.PLAIN, 15);

    private int num1 = 0;
    private int num2 = 0;
    private int num3 = 0;
    private int points = 100;
    private int bet = 1;
    private boolean x = true;
    private int pt = bet;

    public void drawMe(Graphics g){
        g.setColor(lBrown);
        g.fillRect(0, 0, 800, 600);

        g.setColor(dRed);
        g.fillRect(75, 70, 540, 450);
        g.setColor(dBrown);
        g.drawRect(75, 70, 540, 450);

        g.setColor(bBrown);
        g.fillRect(90, 90, 510, 300);

        g.setColor(brown);
        g.fillRect(100, 100, 150, 280);
        g.fillRect(270, 100, 150, 280);
        g.fillRect(440, 100, 150, 280);
        
        g.setColor(dBrown);
        g.drawRect(100, 100, 150, 280);
        g.drawRect(270, 100, 150, 280);
        g.drawRect(440, 100, 150, 280);

        g.setColor(lBrown);
        g.fillRect(110, 110, 130, 260);
        g.fillRect(280, 110, 130, 260);
        g.fillRect(450, 110, 130, 260);

        g.setColor(nBrown);
        g.setFont(font);

        g.drawString(num1 + "", 160, 250);
        g.drawString(num2 + "", 330, 250);
        g.drawString(num3 + "", 500, 250);

        g.setFont(smol);

        g.drawString("Points: " + points, 640, 160);

        g.drawString("Bet: " + bet + " point(s)", 640, 190);

    }

    public void play(){
        if (points - bet < 0){
            System.out.println("Points");
            x = false;
        }
        else if (points > 0 && points - bet >= 0){
            x = true;
            num1 = (int)(Math.random() * 9 + 1);
            num2 = (int)(Math.random() * 9 + 1);
            num3 = (int)(Math.random() * 9 + 1);
            points = points - bet;
        }
        points();
    }

    public void points(){
        if (num1 == num2 && num2 == num3 && num1 != 0 && num2 != 0 && num3 != 0){
            if (num1 == 7){
                points = points + (bet * 100);
            }
            points = points + (5*bet);
        }
        if (num1 == num2 || num2 == num3 || num1 == num3 && num1 != 0){
            points = points + (2*bet);
        }
        pt = bet;
    }

    public void check(Graphics g){
        if (x == false){
            g.setFont(smoller);
            g.setColor(dBrown);
            g.drawString("Cannot play.", 640, 240);
            g.drawString("Not enough points.", 640, 265);
        }
        if (num1 == num2 && num2 == num3 && num1 > 0){
            if (num1 == 7){
                g.setFont(smoller);
                g.drawString("+" + (pt * 100) + " points", 640, 215);
            }
            g.setFont(smoller);
            g.drawString("+" + (pt * 5) + " points", 640, 215);
        }
        else if ((num1 != 0 && num1 == num2) || (num1 != 0 && num2 == num3) || (num1 != 0 && num1 == num3)){
            g.setFont(smoller);
            g.drawString("+" + (pt * 2) + " points", 640, 215);
        }
        else if (num1 != 0){
            g.setFont(smoller);
            g.drawString("- " + pt + " point(s)", 640, 215);
        }
        if (points == 0){
            g.setFont(smol);
            g.setColor(red);
            g.drawString("You lose! :(", 640, 295);
        }
    }

    public void bet1(){
        bet = 1;
    }

    public void bet5(){
        bet = 5;
    }

    public void bet10(){
        bet = 10;
    }

}