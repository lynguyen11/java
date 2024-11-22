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
	
    private SlotMachine sm;
    private JButton playB;
    private JButton bet1;
    private JButton bet5;
    private JButton bet10;
    private boolean x = true;
    //private JTextField t1;
	//private int tr = 20;

    public Screen(){
        sm = new SlotMachine();

        this.setLayout(null);

        //Button
        playB = new JButton("Play");
        playB.setBounds(295, 400, 100, 30); //sets the location and size
        playB.addActionListener(this); //add the listener
        this.add(playB); //add to JPanel

        bet1 = new JButton("Bet 1 pt");
        bet1.setBounds(170, 450, 110, 30); //sets the location and size
        bet1.addActionListener(this); //add the listener
        this.add(bet1); //add to JPanel
        
        bet5 = new JButton("Bet 5 pts");
        bet5.setBounds(290, 450, 110, 30); //sets the location and size
        bet5.addActionListener(this); //add the listener
        this.add(bet5); //add to JPanel

        bet10 = new JButton("Bet 10 pts");
        bet10.setBounds(410, 450, 110, 30); //sets the location and size
        bet10.addActionListener(this); //add the listener
        this.add(bet10); //add to JPanel

        //TextField
        //t1 = new JTextField(20);
        //t1.setBounds(50, 50, 100, 30);
        //this.add(t1);


        this.setFocusable(true);
      	setLayout(null);
    }

	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);

        sm.drawMe(g);
        sm.check(g);

	}

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bet1) {
            sm.bet1();
            repaint();
        }
        if (e.getSource() == bet5) {
            sm.bet5();
            repaint();
        }
        if (e.getSource() == bet10) {
            sm.bet10();
            repaint();
        }
        if (e.getSource() == playB) {
            sm.play();
            repaint();
        }
    }

}