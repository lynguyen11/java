//Arcade Game
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import java.util.HashMap;
import javax.swing.*;
import java.util.*;
import java.awt.Color;
import java.awt.Graphics;

public class ArcadeGame{
    //game graphics
    private Image image;
    private HashMap<Integer, String> slimes; 
    private HashMap<Integer, Image> slimestickers;
    private int num1, num2, num3;

    //import slime stickers
    public void makingSlimes() {
        //initializes fruits + fruit 
        slimes = new HashMap<>();
        slimeStickers = new HashMap<>(); //technically initialization can also be done upon declaration

        //stores items in fruits hashmap: assigns a "key" to a value
        slimes.put(1, "blue_slime.png");
        slimes.put(2, "pink_slime.png");
        slimes.put(3, "purple_slime.png");
        slimes.put(4, "boss_slime.png");

        //sets pathway to load fruit pngs into the fruit hashmap
        for (Integer key:slimes.keySet()) { //reads all string values in hashmap
            //gets file name from strings
            String filePath = slimes.get(key); 
            //makes new images from given file sources
            ImageIcon sticker = new ImageIcon(filePath);
            Image slimes = sticker.getImage();

            //ensures that images are loaded successfully
            if (slimes != null) {
                slimestickers.put(key, slimes);
            } 
            else {
                //use 'system.err.println' to print error messages to the error stream
                System.err.println("Error loading image: " + filePath); //'filepath' helps identify where error occurs
                //furthers returning image as 'null' if not loaded
            }
        }
    }

    //alternate image loading method
    //lazy loading
    public void loadSlimeStickers() {
        if (slimeStickers.isEmpty()) { // load images only if not already loaded
            slimeStickers.put(1, new ImageIcon("blue_slime.png").getImage());
            slimeStickers.put(2, new ImageIcon("pink_slime.png").getImage());
            slimeStickers.put(3, new ImageIcon("purple_slime.png").getImage());
            slimeStickers.put(4, new ImageIcon("boss_slime.png").getImage());
        }
    }
    
    public void drawSlimes(Graphics g) {
		    //sets background to match slot machine picture background
        g.setColor(white);
        g.fillRect(0,0,800,600);

        //slime sticker pngs (correspond to slot machine numbers)
        loadSlimeStickers();
        g.drawImage(getSlimeSticker(num1), 233, 260, 80, 80, null); //position, dimensions(w,h), color 
        g.drawImage(getSlimeSticker(num2), 346, 260, 80, 80, null);
        g.drawImage(getSlimeSticker(num3), 459, 260, 80, 80, null);
       
    }
    
}