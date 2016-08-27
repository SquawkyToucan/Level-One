package Day9;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		new FortuneCookie().showButton();
	}
	public void getFortune() {
		int random = new Random().nextInt(10);
		if(random == 0) {
			JOptionPane.showMessageDialog(null, "A person near you will soon become a cheater. *cough* Dalia");
		}
		if(random == 1) {
			JOptionPane.showMessageDialog(null, "You will soon inherit a large fortune.");
		}
		if(random == 2) {
			JOptionPane.showMessageDialog(null, "Something that sounds good will soon become dark.");
		}
		if(random == 3) {
			JOptionPane.showMessageDialog(null, "Vote for Trump, live in a dump.");
		}
		if(random == 4) {
			JOptionPane.showMessageDialog(null, "The environment is very dear - do not let anyone destroy it.");
		}
		if(random == 5) {
			JOptionPane.showMessageDialog(null, "FreeRice.com will reward you for having an arsenal of knowledge.");
		}
		if(random == 6) {
			JOptionPane.showMessageDialog(null, "Don't listen to urmom and urdad - follow your own path.");
		}
		if(random == 7) {
			JOptionPane.showMessageDialog(null, "Do things now, be punished later.");
		}
		if(random == 8) {
			JOptionPane.showMessageDialog(null, "Be honest.");
		}
		if(random == 9) {
			JOptionPane.showMessageDialog(null, "Once you go Mac, you can't go back!");
		}
	}
	public void showButton() {
		JFrame frame = new JFrame();
		JButton butt = new JButton();
		frame.setVisible(true);
		frame.add(butt);
		frame.setSize(300, 300);
		butt.addActionListener(this);
		butt.setText("Get a Fortune!");
		frame.setTitle("Your Fate...");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		getFortune();
	}
}
