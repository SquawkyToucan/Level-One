package Day9;

import java.util.Random;

import javax.swing.JOptionPane;

public class FortuneCookie {
	public static void main(String[] args) {
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
			JOptionPane.showMessageDialog(null, "Don't listen to your mother and father - follow your own path.");
		}
		if(random == 7) {
			JOptionPane.showMessageDialog(null, "Do things now, be punished later.");
		}
		if(random == 8) {
			JOptionPane.showMessageDialog(null, "Be honest and pay those whom you owe - It is the right thing to do.");
		}
		if(random == 9) {
			JOptionPane.showMessageDialog(null, "Once you go Mac, you can't go back!");
		}
	}
}
