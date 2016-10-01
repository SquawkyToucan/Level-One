package DaysTenAndUp.Day17;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Copyright The League of Amazing Programmers, 2015
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;

import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import javazoom.jl.player.advanced.AdvancedPlayer;

/* 1. Download the JavaZoom jar from here: http://bit.ly/javazoom
* 2. Right click your project and add it as an External JAR (Under Java Build Path > Libraries).*/

public class Radio implements Runnable, ActionListener {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Radio());
	}
	JButton tempestButton = new JButton();
	JButton waitwaitButton = new JButton();
	JButton rainforestButton = new JButton();
	Song tempest = new Song("Tempest.mp3");
    Song waitwait = new Song("waitwait.mp3");
    Song rainforest = new Song("SoundRainforest.mp3");
    public void run() {
		// 3. Find an mp3 on your computer or on the Internet.
		// 4. Create a Song
		// 5. Play the Song
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.add(rainforestButton);
		panel.add(waitwaitButton);
		panel.add(tempestButton);
		frame.add(panel);
		frame.setVisible(true);
		rainforestButton.setText("Rainforest Background Channel");
		waitwaitButton.setText("Quiz Show");
		tempestButton.setText("Instrumental Channel");
		rainforestButton.addActionListener(this);
		waitwaitButton.addActionListener(this);
		tempestButton.addActionListener(this);
		frame.pack();
    }
	/* Use this method to add album covers to your Panel. */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed == rainforestButton) {
			rainforest.stop();
			waitwait.stop();
			tempest.stop();
			rainforest.play();
		}
		if(buttonPressed == tempestButton) {
			rainforest.stop();
			waitwait.stop();
			tempest.stop();
			tempest.play();
		}
		if(buttonPressed == waitwaitButton) {
			rainforest.stop();
			waitwait.stop();
			tempest.stop();
			waitwait.play();
		}
	}
}

class Song {

	private int duration;
	private String songAddress;
	private AdvancedPlayer mp3Player;
	private InputStream songStream;

	/**
	 * Songs can be constructed from files on your computer or Internet
	 * addresses.
	 * 
	 * Examples: <code> 
	 * 		new Song("everywhere.mp3"); 	//from default package 
	 * 		new Song("/Users/joonspoon/music/Vampire Weekend - Modern Vampires of the City/03 Step.mp3"); 
	 * 		new	Song("http://freedownloads.last.fm/download/569264057/Get%2BGot.mp3"); 
	 * </code>
	 */
	public Song(String songAddress) {
		this.songAddress = songAddress;
	}

	public void play() {
		loadFile();
		if (songStream != null) {
			loadPlayer();
			startSong();
		} else
			System.err.println("Unable to load file: " + songAddress);
	}

	public void setDuration(int seconds) {
		this.duration = seconds * 100;
	}

	public void stop() {
		if (mp3Player != null)
			mp3Player.close();
	}

	private void startSong() {
		Thread t = new Thread() {
			public void run() {
				try {
					if (duration > 0)
						mp3Player.play(duration);
					else
						mp3Player.play();
				} catch (Exception e) {
				}
			}
		};
		t.start();
	}

	private void loadPlayer() {
		try {
			this.mp3Player = new AdvancedPlayer(songStream);
		} catch (Exception e) {
		}
	}

	private void loadFile() {
		if (songAddress.contains("http"))
			this.songStream = loadStreamFromInternet();
		else
			this.songStream = loadStreamFromComputer();
	}

	private InputStream loadStreamFromInternet() {
		try {
			return new URL(songAddress).openStream();
		} catch (Exception e) {
			return null;
		}
	}

	private InputStream loadStreamFromComputer() {
		try {
			return new FileInputStream(songAddress);
		} catch (FileNotFoundException e) {
			return this.getClass().getResourceAsStream(songAddress);
		}
	}
}
