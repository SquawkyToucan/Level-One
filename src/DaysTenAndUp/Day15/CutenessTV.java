package DaysTenAndUp.Day15;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	// Declare frames and buttons
	public static void main(String[] args) {
		CutenessTV tv = new CutenessTV();
		tv.run();
	}

	public void showBabyToucans() {
		playVideo("9oBrE5DRLVY");
	}

	public void showBrown() {
		playVideo("nFlDd4ICqR0");
	}

	public void chihuahua() {
		playVideo("YMJdqbOLEDk");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	JButton babyToucans = new JButton();
	JButton brown = new JButton();
	JButton chihuahua = new JButton();
	public void run() {
		// Declare frames and buttons
		JFrame frame = new JFrame();
		JPanel buttons = new JPanel();
		Dimension buttonSize = new Dimension(200, 100);
		// Edit buttons
		babyToucans.setText("Baby Toucans");
		brown.setText("Brown the Bear");
		chihuahua.setText("Little Chihuahua");
		babyToucans.setPreferredSize(buttonSize);
		brown.setPreferredSize(buttonSize);
		chihuahua.setPreferredSize(buttonSize);
		babyToucans.addActionListener(this);
		brown.addActionListener(this);
		chihuahua.addActionListener(this);
		// Add
		buttons.add(babyToucans);
		buttons.add(brown);
		buttons.add(chihuahua);
		frame.add(buttons);
		frame.setVisible(true);
		frame.pack();
		frame.setTitle("CutenessTV - The Best Way to Barf Rainbows.");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton)e.getSource();
		if(buttonPressed == babyToucans) {
			showBabyToucans();
		}
		if(buttonPressed == brown) {
			showBrown();
		}
		if(buttonPressed == chihuahua) {
			chihuahua();
		}
	}
}
