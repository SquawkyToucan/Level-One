package DaysTenAndUp.Day17;

import java.applet.AudioClip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class CowTimer {
	/*
	 * This is an advanced recipe. There may be more than one line of code for
	 * each instruction. Work in seconds when testing, then change to minutes
	 */
	private int minutes;

	public static void main(String[] args) throws InterruptedException {
		String input = JOptionPane.showInputDialog(null, "Enter a number of seconds. \nOne minute = 60 seconds, one hour = 3600 seconds");
		int time = Integer.parseInt(input);
		CowTimer timer = new CowTimer();
		timer.setTime(time);
		timer.start();
	}

	public void setTime(int minutes) {
		this.minutes = minutes;
		System.out.println("Cow set to " + minutes + " seconds.");
	}

	public void start() throws InterruptedException {
		while(minutes > 0) {
			Thread.sleep(1000);
			minutes--;
			speak(minutes);
			System.out.println("You have " + minutes + " seconds left.");
			if(minutes == 0) {
				speakString("Das ist ein Kuh.");
				playSound("moo.wav");
			}
		}

		/*
		 * 3. When the timer is finished, use the playSound method to play a moo
		 * sound. You can download one from freesound.org, then drag it into
		 * your default package. Tell the students (by speaking) it's time to
		 * walk.
		 */
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	private void speak(int minutes2) {
		try {
			Runtime.getRuntime().exec("say " + minutes2).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void speakString(String hehe) {
		try {
			Runtime.getRuntime().exec("say " + hehe).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
