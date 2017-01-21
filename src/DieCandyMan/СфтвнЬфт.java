package DieCandyMan;
import javax.swing.JFrame;
import javax.swing.JButton;
public class СфтвнЬфт {
	public static void main(String[]сука) {
		new СфтвнЬфт().run();
	}
	public void run() {
		JFrame frame = new JFrame();
		JButton candyman = new JButton();
		frame.add(candyman);
		frame.setVisible(true);
		candyman.setText("Candyman");
		frame.pack();
	}
}
