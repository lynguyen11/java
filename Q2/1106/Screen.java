import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Screen extends JPanel implements ActionListener{
  
  	private JButton b1;
    private JTextField t1;
	  private int tr = 20;

	  private Color green = new Color(134, 227, 148);
  	private Color brown = new Color(173, 137, 97);
  	private Color gray = new Color(147, 147, 147);
  	private Color pink = new Color(240, 187, 236);
  	private Color yellow = new Color(252, 244, 172);
  	private Color black = new Color(10, 10, 20);
  
  	public Screen() {
        this.setLayout(null);


        //Button
        b1 = new JButton("Refresh");
        b1.setBounds(50, 100, 100, 30); //sets the location and size
        b1.addActionListener(this); //add the listener
        this.add(b1); //add to JPanel


        //TextField
        t1 = new JTextField(20);
        t1.setBounds(50, 50, 100, 30);
        this.add(t1);


        this.setFocusable(true);
      	setLayout(null);

    }

	@Override
	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
      //trees
        for(int i = 0; i < tr; i++){
            int x = (int)(Math.random() * 751);
            int y = (int)(Math.random() * 151 + 350);
            drawTree(g, x, y);
        }
      
      //Clouds
      	for(int i = 0; i < 5; i++){
            int x = (int)(Math.random() * 751);
            int y = (int)(Math.random() * 200);
            drawCloud(g, x, y);
        }
      //Birds
      	for(int i = 0; i < 3; i++){
            int x = (int)(Math.random() * 751);
            int y = (int)(Math.random() * 200);
            drawBird(g, x, y);
        }
      //Flowers
      	for(int i = 0; i < 20; i++){
            int x = (int)(Math.random() * 780);
            int y = (int)(Math.random() * 200+370);
            drawFlower(g, x, y);
        }
      
      	//draw instructions
        Font font = new Font("Arial", Font.PLAIN, 20);
        g.setFont(font);
        g.setColor(black);
        g.drawString("# of trees: ", 50, 20);
      
	}

  	//methods
    public void drawTree(Graphics g, int x, int y){
        g.setColor(brown);
      	g.fillRect(x + 15, y + 45, 20, 40);
      	g.setColor(green);
      	g.fillOval(x, y, 50, 50);
    }
  
  
  	public void drawCloud(Graphics g, int x, int y){
      	g.setColor(gray);
        g.fillOval(x, y, 50, 20);
    }
  
  
  	public void drawFlower(Graphics g, int x, int y){
      	g.setColor(pink);
      	g.fillOval(x, y, 20, 20);
      	g.fillOval(x - 10, y + 10, 20, 20);
      	g.fillOval(x + 10, y + 10, 20, 20);
      	g.fillOval(x + 5, y + 20, 20, 20);
      	g.fillOval(x - 5, y + 20, 20, 20);
      	g.setColor(yellow);
      	g.fillOval(x, y + 10, 20, 20);
    }
  
  	public void drawBird(Graphics g, int x, int y){
      	g.setColor(brown);
        g.fillRect(x, y, 20, 10);
        g.fillOval(x+10, y, 20, 10);
        g.fillOval(x+10, y, 8, 17);
    }
  
  	public void actionPerformed(ActionEvent e) {
        String word = t1.getText();
      	tr = Integer.parseInt(word);
      	if (e.getSource() == b1) {
            System.out.println("Button has been clicked");
            repaint();
        }
    }

}