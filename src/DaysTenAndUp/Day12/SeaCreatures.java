package DaysTenAndUp.Day12;

/*
 * 1. In a Runner class, make a SeaCreature called “Spongebob”. Use the methods below to make him eat, and laugh.
 * 2. Make Patrick and Squidward and print their name, have them eat, and make them laugh.
 */

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SeaCreatures {
	private String name;
	SeaCreatures(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name;
	}

	public void eat() {
		System.out.println(name + " is eating krabby patties");
	}

	public void laugh() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(
					"/Users/League/Google Drive/league-sounds/" + this.name + ".wav").toURI().toURL());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public void kill() {
		System.out.println("A body was found, horribly torn and bloated.");
	}
	public void beJerk() {
		System.out.println(name + " built a wall.");
	}
	public void startWar() {
		System.out.println(name + " attacked SpongeBob for being annoying and doing this...");
	}
	public void climbWall() {
		System.out.println(name + " climbed over a wall.");
	}
}