package Casino;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IslandCasino {
	public static void main(String[] args) {
		new IslandCasino().run();
	}
	public void run() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton wasteMoney = new JButton("Waste Your Money! (But release dopamine so you stay at this machine)");
		JTextField wager = new JTextField();
		JLabel text = new JLabel("Welcome to the Casino. \nPlay our totally great non-rigged slot machines! \nMaximum prize is 110% on a return. \nAlso, enjoy our free selection of alchoholic drinks!");
		//GUI
		frame.add(panel);
		panel.add(text);
		panel.add(wager);
		panel.add(wasteMoney);
		frame.setVisible(true);
		frame.pack();
	}
}
