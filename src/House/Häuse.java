package House;

import org.jointheleague.graphical.robot.*;
import java.awt.Color;
import java.util.Random;

public class Häuse {
	Robot bruh;
	Häuse() {
		bruh = new Robot();
	}
	public void start() {
		bruh.setX(80);
		bruh.setY(840);
		bruh.setSpeed(10);
	}
	public void penDown() {
		bruh.penDown();
		bruh.setRandomPenColor();
	}
	public void penUp() {
		bruh.penUp();
	}
	public void drawHouse(int height) {
		if(height <= 200) {
			//Peaked Roof
			bruh.turn(-30);
			bruh.move(25);
			bruh.turn(-120);
			bruh.move(25);
			bruh.turn(-30);
		}
		else {
			//Flat Roof
			bruh.turn(-90);
			bruh.move(30);
			bruh.turn(-90);
		} 
		bruh.move(height);
		bruh.turn(-90);
		//Grass
		Color grass = new Color(000, 187, 119);
		bruh.setPenColor(grass);
	}

}