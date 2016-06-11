package Day3;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PoliticianBodyParts {
	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String bernieImage = "/Users/League/Desktop/hehebernie.jpg";
	String secondImage = "/Users/League/Desktop/failtrump.png";
	String thirdImage = "/Users/League/Desktop/clintonsucks.jpg";
	Frame window = new Frame();
	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
		window.setSize(212, 213);
		int score = 0;
		String bernie = JOptionPane.showInputDialog("Whose finger is this?", "Hint: Soviet Union, East Germany");
		if(bernie.contains("bernie")||bernie.contains("Bernie")||bernie.contains("anders")){
			JOptionPane.showMessageDialog(null, "Any fourth grade history student knows socialism \nhas failed in every country, at every time in history. \nPresident Obama and his Democrats \nare either idiots or deliberately trying \nto destroy their own economy. \n-Vladmir Putin");
			JOptionPane.showMessageDialog(null, "That is correct.");
			score++;
		}
		else{
			JOptionPane.showMessageDialog(null, "And you fail!");
			JOptionPane.showMessageDialog(null, "Bernie Sanders was the correct answer.");
		}
		showNextImage();
		window.setSize(257, 153);
		String scheisse = JOptionPane.showInputDialog("Who ate this taco bowl?", "Hint: Won every district except Manhattan in New York, (R)");
		if(scheisse.contains("Donald")||scheisse.contains("donald")||scheisse.contains("rump")){
			JOptionPane.showMessageDialog(null, "If you are a Trump supporter, I hope you don't eat Taco Bowls. Then you would be a hypocrite.");
			JOptionPane.showMessageDialog(null, "That is correct.");
			score++;
		}
		else{
			JOptionPane.showMessageDialog(null, "And you fail!");
			JOptionPane.showMessageDialog(null, "Donald Trump was the correct answer.");
		}
		showNextImage();
		window.setSize(50, 57);
		String arsch = JOptionPane.showInputDialog("Who uses this private email server?", "Hint: Superdelegates");
		if(arsch.contains("Hillary")||arsch.contains("Hillary")||arsch.contains("linton")){
			JOptionPane.showMessageDialog(null, "Spam this address, please - hillary@clinton.gov.");
			JOptionPane.showMessageDialog(null, "That is correct.");
			score++;
		}
		else{
			JOptionPane.showMessageDialog(null, "And you fail!");
			JOptionPane.showMessageDialog(null, "Hillary Clinton was the correct answer.");
		}
		JOptionPane.showMessageDialog(null, "Your score was " + score + " out of a possible 3.");	}
	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}
	public static void main(String[] args) {
		PoliticianBodyParts quiz = new PoliticianBodyParts();
		quiz.initializeGui();
		quiz.startQuiz();
	}
	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}
	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}
	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;
	private void initializeImageList() {
		JLabel imageLabel = loadImage(bernieImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}
	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}

//This is the last line!