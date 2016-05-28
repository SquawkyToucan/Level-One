package Day1;
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {
	public static void main(String[] args) throws Exception {
		int score = 0;
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
		String toco = "http://www.animalfactguide.com/wp-content/uploads/2013/01/tocotoucan2.jpg";
		String keel = "http://a-z-animals.com/media/animals/images/original/keel_billed_toucan4.jpg";
		String redbilled = "https://c2.staticflickr.com/4/3370/3419770546_5ee004bd46_z.jpg?zz=1";
		String choco = "http://www.wildlifeontheweb.co.uk/parrots/slides/Toucan,%20Choco,%20Milpe,%20Ecuador,%202013%20(3).jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component tocotoucan = createImage(toco);
		// 3. use the "createImage()" method below to initialize your Component
		
		// 4. add the image to the quiz window
		quizWindow.add(tocotoucan);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String tocoIsCorrect = JOptionPane.showInputDialog("What is this type of toucan?");
		// 7. print "CORRECT" if the user gave the right answer
		if(tocoIsCorrect.contains("toco")||tocoIsCorrect.contains("Toco")){
			JOptionPane.showMessageDialog(null, "That is correct!");
			score++;
		}
		else{
			JOptionPane.showMessageDialog(null, "Incorrect.");
		}
		// 8. print "INCORRECT" if the answer is wrong

		quizWindow.remove(tocotoucan);
		Component keelbilledtoucan = createImage(keel);
		Thread.sleep(500);
		quizWindow.add(keelbilledtoucan);
		quizWindow.pack();
		String keelIsCorrect = JOptionPane.showInputDialog("What is the name of this kind of toucan?");
		if(keelIsCorrect.contains("keel")||keelIsCorrect.contains("Keel")){
			JOptionPane.showMessageDialog(null, "That is correct.");
			score++;
		}
		else{
			JOptionPane.showMessageDialog(null, "You are incorrect. Stinks for you.");
		}
		// 14+ check answer, say if correct or incorrect, etc.
		quizWindow.remove(keelbilledtoucan);
		Component redbilledtoucan = createImage(redbilled);
		quizWindow.add(redbilledtoucan);
		quizWindow.pack();
		String redbilledIsCorrect = JOptionPane.showInputDialog("What is the name of this kind of toucan?");
		if(redbilledIsCorrect.contains("red billed")||redbilledIsCorrect.contains("Red Billed")||redbilledIsCorrect.contains("white throated")||redbilledIsCorrect.contains("White Throated")){
			JOptionPane.showMessageDialog(null, "That is correct.");
			score++;
		}
		else{
			JOptionPane.showMessageDialog(null, "You are incorrect. You should learn about it.");
		}
		quizWindow.remove(redbilledtoucan);
		Component chocotoucan = createImage(choco);
		quizWindow.add(chocotoucan);
		quizWindow.pack();
		String chocoIsCorrect = JOptionPane.showInputDialog("What is the name of this kind of toucan?");
		if(chocoIsCorrect.contains("choco")||chocoIsCorrect.contains("Choco")){
			JOptionPane.showMessageDialog(null, "That is correct.");
			score++;
		}
		else{
			JOptionPane.showMessageDialog(null, "You are incorrect. I like chocolate.");
		}
		JOptionPane.showMessageDialog(null, "You scored a " + score + " out of a possible 4.");
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}
