package DaysTenAndUp.Day19;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class SensitiveKeyboard implements KeyListener{
	public static void main(String[] toucan) {
		new SensitiveKeyboard().run();
	}
	public void run() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.addKeyListener(this);
	}
	static void speak(String words) {
	   	 try {
	   		 Runtime.getRuntime().exec("say " + words).waitFor();
	   	 } catch (Exception e) {
	   		 e.printStackTrace();
	   	 }
	} 

	
	@Override
	public void keyTyped(KeyEvent e) {
		speak("Du bist sehr doof.");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		speak("Hast du ein Gesicht?" + e.getKeyChar());
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}