package DaysTenAndUp.Day16;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener {
	private static String pigWord(String word) {
		int split = firstVowel(word);
		return word.substring(split) + "-" + word.substring(0, split) + "ay";
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton convert = new JButton();
	JTextField entry = new JTextField(20);
	JTextField answer = new JTextField(20);
	public static void main(String[] args) {
		new PigLatin().run();
	}
	public void run() {
		panel.add(entry);
		panel.add(convert);
		panel.add(answer);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		frame.setSize(275, 135);
		convert.setText("Convert");
		convert.addActionListener(this);
	}
	/**
	 * Method to translate a sentence word by word.
	 * @param The sentence in English
	 * @return The Pig Latin Version
	 */
	public String translate(String s) {
		String latin = "";
		int i = 0;
		while (i < s.length()) {
			// Take care of punctuation and spaces
			while (i < s.length() && !isLetter(s.charAt(i))) {
				latin = latin + s.charAt(i);
				i++;
			}
			// If there aren't any words left, stop.
			if (i >= s.length())
				break;
			// Otherwise we're at the beginning of a word.
			int begin = i;
			while (i < s.length() && isLetter(s.charAt(i))) {
				i++;
			}
			// Now we're at the end of a word, so translate it.
			int end = i;
			latin = latin + pigWord(s.substring(begin, end));
		}
		return latin;
	}

	private static boolean isLetter(char c) {
		return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'));
	}

	private static int firstVowel(String word) {
		word = word.toLowerCase();
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u') {
				return i;
			}
		}
		return 0;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		answer.setText(translate(entry.getText()));
	}
}
