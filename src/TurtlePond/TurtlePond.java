package TurtlePond;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class TurtlePond implements KeyEventDispatcher {
	// 1. Set a location for the cookie
	int cookieX = new Random().nextInt(400);
	int cookieY = new Random().nextInt(400);
	// 2. Choose the speed you want the Tortoise to go at
	int speed = 5;
	void setup() {
		// 3. Edit this intro message to your own style
		//JOptionPane.showMessageDialog(null, "Hast du etwas Zeit für eine Schlidkrote? Er habt Hünger und er braucht ein Cookie. Hilft ihr? \n(Die rot Farbe ist sehr gut!)");
	}
	private void goUp() {
		Tortoise.move(speed);
	}
	private void goDown() {
		Tortoise.move(-speed);
	}
	private void goLeft() {
		Tortoise.turn(-90);
		Tortoise.move(speed);
		Tortoise.turn(90);
	}
	private void goRight() {
		Tortoise.turn(90);
		Tortoise.move(speed);
		Tortoise.turn(-90);
	}
	private void checkForFood() throws Exception {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		// 7. If the Tortoise is within 100 pixels of the food, set the
		// background color to yellow
		if(getTimeElapsed() > 30 || wasHereBefore(tortoiseLocationX, tortoiseLocationY)) {
			if(getTimeElapsed() > 30) {
				JOptionPane.showMessageDialog(null, "Die Schlidkrote ist tot. Du wast sehr langsam und doof, oder du felschlagst.");
				System.exit(0);
			}
			else {
				Tortoise.setX(250);
				Tortoise.setY(200);
			}
		}
		if(((tortoiseLocationX + 5 > cookieX)&&(tortoiseLocationX - 5 < cookieX))&&((tortoiseLocationY + 5 > cookieY)&&(tortoiseLocationY - 5 < cookieY))) {
			JOptionPane.showMessageDialog(null, "Du gewinnst!");
		}
		if(((tortoiseLocationX + 20 > cookieX)&&(tortoiseLocationX - 20 < cookieX))&&((tortoiseLocationY + 20 > cookieY)&&(tortoiseLocationY - 20 < cookieY))) {
			setBackgroundColor(new Color(255, 0, 0));
		}
		else {
		if(((tortoiseLocationX + 50 > cookieX)&&(tortoiseLocationX - 50 < cookieX))&&((tortoiseLocationY + 50 > cookieY)&&(tortoiseLocationY - 50 < cookieY))) {
			setBackgroundColor(new Color(255, 136, 17));
		}
		else { 
			if(((tortoiseLocationX + 100 > cookieX)&&(tortoiseLocationX - 100 < cookieX))&&((tortoiseLocationY + 100 > cookieY)&&(tortoiseLocationY - 100 < cookieY))) {
				setBackgroundColor(new Color(255, 255, 51));
			}
			else {
				setBackgroundColor(new Color(128, 128, 128));
			}
		}
		}
		// 8. If the Tortoise is within 50 pixels of the food, set the
		// background color to orange

		// 9. If the Tortoise is within 20 pixels of the food, set the
		// background color to red

		// 10. If the Tortoise is within 5 pixels of the cookie, make a pop-up
		// to tell them they found it

		// 11. If more than 20 seconds have elapsed, tell them the turtle died
		// of hunger!
		//die schlidkrote ist tot. du wast sehr langsam und doof, aber du fallst.
		// 12. If the Tortoise crosses it's own path, tell them they failed and
		// move them back to the beginning

	}

	private long getTimeElapsed() {
		Date currentTime = new Date();
		return (currentTime.getTime() - startTime.getTime()) / 1000;
	}

	private void setBackgroundColor(Color color) {
		Tortoise.getBackgroundWindow().setBackground(color);
	}

	private void showCookie() {
		Tortoise.getBackgroundWindow().addPaintable(new Paintable() {
			public void paint(Graphics2D g, JPanel caller) {
				g.drawOval(cookieX, cookieY, 10, 10);
			}
		});
	}

	private boolean wasHereBefore(int xPosition, int yPosition) {
		if (previousLocations.contains(new Point(xPosition, yPosition)))
			return true;
		else
			return false;
	}

	/***********************
	 * don't worry about the stuff under here
	 ******************/

	Date startTime = new Date();

	public static void main(String[] args) {
		TurtlePond feeder = new TurtlePond();
		feeder.controlTheTortoise();
		feeder.setup();
	}

	private void controlTheTortoise() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		Tortoise.show();
		Tortoise.setPenColor(PenColors.Purples.DarkMagenta);
		Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.SlateGray);
		Tortoise.setSpeed(10);
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {

			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();

			try {
				checkForFood();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			savePosition(Tortoise.getX(), Tortoise.getY());
		}
		return false;
	}

	ArrayList<Point> previousLocations = new ArrayList<Point>();

	private void savePosition(int xPosition, int yPosition) {
		previousLocations.add(new Point(xPosition, yPosition));
	}
}
