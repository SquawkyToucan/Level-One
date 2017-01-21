package AnimalsSuckingAtJumping;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class iAnimals {
	public static void main(String[] args) throws MalformedURLException {
		String urlOfAnimalSuckingAtJumping = "http://68.media.tumblr.com/732566e8da647df1ff3709c4c358eba0/tumblr_n6al0kAFax1s612eao1_250.gif";
		JFrame frame = new JFrame();
		JLabel label = createImage(urlOfAnimalSuckingAtJumping);
		frame.setTitle("This warrior punishes those who hide behind their puny curtains...");
		frame.add(label);
		frame.setVisible(true);
		frame.pack();
	}
	static JLabel createImage(String imageURL) throws MalformedURLException {
		URL url = new URL(imageURL);
		Icon icon = new ImageIcon(url);
		return new JLabel(icon);
	}
}