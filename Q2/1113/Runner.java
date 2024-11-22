import javax.swing.JFrame;
import javax.swing.*;

public class Runner {
  
	public static void main(String[] args) {

		JFrame frame = new JFrame("Animation");
		Screen sc = new Screen();
		
		frame.add(sc);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		sc.animate();
    }
}
