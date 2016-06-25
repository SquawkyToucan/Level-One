package Day5;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
 
/** We’re going to make a slide show of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class Illusions extends MouseAdapter {

	/*
	 * Here we are instantiating our Illusions class and calling it’s createBook() method. This is because we want to get out of the
	 * static main method, so that we can add a click listener to each illusion.
	 */

	public static void main(String[] args) throws Exception {
		Illusions illusions = new Illusions();
		illusions.createBook();
	}
	JFrame frame = new JFrame();
	JLabel label;
	boolean clickedOnce = false;
	boolean clickedTwice = false;
	private void createBook() {
		// 2. make the frame visible
		frame.setVisible(true);
		// 3. set the size of the frame
		frame.setSize(100, 100);
		// 4. find 2 images and save them to your project’s default package
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		String ill1 = "colori.gif";
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		// 7. use the "loadImage..." methods below to initialize your JLabel
		label = loadImageFromComputer(ill1);
		// 8. add your JLabel to the frame
		frame.add(label);
		// 9. call the pack() method on the frame
		frame.pack();
		// 10. add a mouse listener to your frame (hint: use *this*)
		frame.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {
	if(clickedOnce == false){
		JOptionPane.showMessageDialog(null, "Is it half of a face or is it the skinny side of another face?");
		// 11. Print "clicked!" to the console when the mouse is pressed
		System.out.println("Clicked!");
		// 12. remove everything from the frame that was added earlier
		frame.remove(label);
		// 13. load a new image like before (this is more than one line of code)
		label = loadImageFromComputer("confuse.jpg");
		frame.add(label);
		// 14. pack the frame
		frame.pack();
		clickedOnce = true;
	}
	else if(clickedOnce == true && clickedTwice == false){
		JOptionPane.showMessageDialog(null, "Where does the ring end? IT DOESN'T.");
		System.out.println("Clicked!");
		frame.remove(label);
		label = loadImageFromComputer("hi.jpg");
		frame.add(label);
		frame.pack();
		clickedTwice = true;
	}
	else{
		JOptionPane.showMessageDialog(null, "");
		System.out.println("Clicked!");
		frame.remove(label);
		label = loadImageFromComputer("optical-illusion-spiral.gif");
		frame.add(label);
		frame.pack();
	}
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}

