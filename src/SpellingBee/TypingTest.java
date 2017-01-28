package SpellingBee;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

public class TypingTest {
	public static void main(String[] args) {
		long CTime = (System.nanoTime());
		long time = TimeUnit.NANOSECONDS.toSeconds(CTime);
		int word = 0;
		int attempts = 0;
		ArrayList<String> Dictionary = new ArrayList<String>();
		Dictionary.add("botany");
		Dictionary.add("zodiac");
		Dictionary.add("toucan");
		Dictionary.add("insulate");
		Dictionary.add("fervently");
		Dictionary.add("magenta");
		Dictionary.add("hovel");
		Dictionary.add("irresistible");
		Dictionary.add("handkerchief");
		Dictionary.add("accommodate");
		for(;true;) {
			String antwort = JOptionPane.showInputDialog("Please spell the word " + Dictionary.get(word));
			if(antwort.equals(Dictionary.get(word))&&word < 9) {
				word++;
				attempts++;
			}
			else if(word == 9) {
				long endtime = (System.nanoTime());
				long littime = TimeUnit.NANOSECONDS.toSeconds(endtime);
				JOptionPane.showMessageDialog(null, "Du gewwinst! Accuracy: " + (900.00/attempts));
				System.out.println((littime-time));
				JOptionPane.showMessageDialog(null, "You scored " + (((littime-time))+(900.00/attempts)));
			}
			else {
				attempts++;
				JOptionPane.showMessageDialog(null, "Es tut mir leid keine! DU BIST SEHR DOOF UND ICH HAßE DICH.");
			}
		}
	}
}
