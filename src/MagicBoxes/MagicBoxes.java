package MagicBoxes;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MagicBoxes extends JPanel implements Runnable, MouseListener{

	/*
	 * Work together as a TEAM of 2 or 3 to make this project. We are going to hide secrets within the magic box. 
	 * When the user clicks on a secret place, stuff will happen.
	 * 
	 * 1. Make the frame respond to mouse clicks.
	 *
	 * 2. When the mouse is clicked, use the Media Palace (bit.ly/media-palace) to play sounds, show images or speak.
	 * 
	 * 3. backgroundImage.getRGB(keyEvent.getX(), keyEvent.getY()) will give you the color of the current pixel.
	 */

	BufferedImage backgroundImage;
	//JFrame frame = new JFrame();
	//JPanel tinaBox = new JPanel();
	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new MagicBoxes());
	}

	@Override
	public void run() {
		try {
			loadBackgroundImage();
			createUI();
		} catch (Exception w) {
			System.err.println(w.getMessage());
		}
	}

	private void createUI() {
		JFrame frame = new JFrame("The Magic Box contains many secrets...");
		JPanel tinaBox = new JPanel();
		frame.add(tinaBox);
		frame.add(this);
		frame.addMouseListener(this);
		setPreferredSize(new Dimension(backgroundImage.getWidth(), backgroundImage.getHeight()));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private void loadBackgroundImage() throws Exception {
		String imageFile = "/Users/league/Desktop/Level-One/src/MagicBoxes/tinaBox.jpg";
		try {
			backgroundImage = ImageIO.read(new File(imageFile));
		} catch (IOException e) {
			throw new Exception("Could not load image: " + imageFile);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y= e.getY();
		System.out.println(x + " " + y);
		if((x >= 440 && x <= 450)&&(y>=575 && y<=580)) {
			JOptionPane.showMessageDialog(null, "MUHAHAHAHHAHAHAHAHAHAHAHA!!!!!!!!!");
			playMusicOnComputer("/Users/league/Desktop/POKEMON_GO_SONG_by_MISHA_FOR_KIDS_.wav");
		}
		if((x >= 245 && x <= 260)&&(y>=400 && y<=406)) {
			JOptionPane.showMessageDialog(null, "LOLOLOLOLOLOLOLOLMFAO!!!!!!!!!");
			playMusicOnComputer("/Users/league/Desktop/Darude_-_Sandstorm.wav");
		}
		if((x >= 370 && x <= 385)&&(y>=600 && y<=610)) {
			JOptionPane.showMessageDialog(null, "LOLOLOLOLOLOLOLOLMFAO!!!!!!!!!");
			playMusicOnComputer("/Users/league/Desktop/bruh.wav");
		}
		if((x >= 0 && x <= 20)&&(y>=0 && y<=20)) {
			JOptionPane.showMessageDialog(null, "LOLOLOLOLOLOLOLOLMFAO!!!!!!!!!");
			playMusicOnComputer("/Users/league/Desktop/yashwin.wav");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void playMusicOnComputer(String fileName) {
		File fileToPlay = new File(fileName);
		try {
			java.awt.Desktop.getDesktop().open(fileToPlay);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}