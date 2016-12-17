package TypingTutor.Day20;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.*;

public class TypingTutor implements KeyListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	public static void main(String[] toucan) {
		new TypingTutor().run();
	}
	public void run() {
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		frame.add(panel);
		frame.addKeyListener(this);
		letter();
		frame.pack();
	}
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}
	char letter = generateRandomLetter();
	void letter() {
		letter = generateRandomLetter();
		System.out.println(letter);
		String current = Character.toString(letter);
		label.setText(current);
		label.setFont(label.getFont().deriveFont(812.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		panel.add(label);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		char userAnswer = e.getKeyChar();
		if(userAnswer == letter) {
			System.out.println("Correct!");
			panel.setBackground(new Color(0, 136, 68));
		}
		else {
			System.out.println("Incorrect!");
			panel.setBackground(new Color(240, 10, 1));
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		letter();
	}
}
