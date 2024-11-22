//Screen Class
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;


import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Screen extends JPanel implements ActionListener{
	
	private JButton loginButton;
    private JTextField pinInput;
    private Bank user;
  	private JButton withdrawal;
  	private JButton deposit;
  	private double balance = user.getBalance(100.99);
  	

    public Screen(){
        setLayout(null);

        user = new Bank("Maria",4321, balance);

      	//button to login
        loginButton = new JButton("Login");
        loginButton.setBounds(50,300,100,30); //x,y,width,height
        add( loginButton ); //add to Jpanel
        loginButton.addActionListener( this );

      	//text thing that asks for pin
        pinInput = new JTextField();
        pinInput.setBounds(50,250,100,30);
        add(pinInput);


      
      	//withdraw button: -$100 to balance
      	withdrawal = new JButton("Withdrawal");
        withdrawal.setBounds(50,400,100,30); //x,y,width,height
        withdrawal.addActionListener( this );
      	add( withdrawal ); //add to Jpanel
      	withdrawal.setVisible(false);
      
      	//deposit button: +$100 to balance
      	deposit = new JButton("Deposit");
        deposit.setBounds(50,450,100,30); //x,y,width,height
        deposit.addActionListener( this );
      	add( deposit ); //add to Jpanel
      	deposit.setVisible(false);
      	
    }


	@Override
	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
        //display the user name
        String name = user.getName();
        g.drawString(name,50,200);
    	String balanceText = "$" + balance;
    	g.drawString( balanceText, 150, 320);
    
    	
	}

    public void actionPerformed(ActionEvent e){
        //When a button gets pressed this method gets called
        if( e.getSource() == loginButton){
            //get info from text field
            String pinText = pinInput.getText();
            //convert string to int
            int pin = Integer.parseInt(pinText);
            //call checkpin
            user.checkPin(pin);
            //refresh
            repaint();
            //if login succesful, remove text fields
            boolean result = user.getAccess();
            if( result == true){
                loginButton.setVisible(false);
                pinInput.setVisible(false);
              	withdrawal.setVisible(true);
              	deposit.setVisible(true);
            }
          	if( e.getSource() == deposit){
              	balance = balance + 100;
            	repaint();
            }
        }
    }
}
