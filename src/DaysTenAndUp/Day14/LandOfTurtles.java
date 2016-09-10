package DaysTenAndUp.Day14;

import java.util.Random;

import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

		JFrame frame = new JFrame();
		frame.setVisible(true);

		// 2. Add the panel to the frame
		frame.add(panel);
		
		// 3. Set the background image of the panel to the Galapagos Islands 
		panel.setBackgroundImage(galapagosIslands);
		frame.pack();
		// 4. Instantiate a Turtle 
		Turtle idk = new Turtle();
// 5. Add the turtle to the panel 
		panel.addTurtle(idk);
		// 6. Put 50 Turtles on the beach
		for(int i = 0; i < 78; i++) {
			int x = new Random().nextInt(600);
			int y = new Random().nextInt(400);
			y = y + 200;
			Turtle whoknows = new Turtle();
			whoknows.setX(x);
			whoknows.setY(y);
			panel.addTurtle(whoknows);
		}
	}
}