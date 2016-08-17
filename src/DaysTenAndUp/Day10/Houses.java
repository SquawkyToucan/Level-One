package DaysTenAndUp.Day10;

import org.teachingextensions.logo.Tortoise;

import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.PenColors;

public class Houses {
	static Tortoise tortoise = new Tortoise();
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		//Frame Dimensions - Height: 400, Length: 600
		tortoise.setSpeed(10);
		tortoise.show();
		tortoise.penUp();
		tortoise.move(-200);
		tortoise.turn(-90);
		tortoise.move(300);
		tortoise.turn(90);
		for(;true;) {
			int idk = new Random().nextInt(500);
			drawHouse(idk);
		}
	}
	@SuppressWarnings("static-access")
	public static void drawHouse(int height) {
		tortoise.penDown();
		tortoise.setPenColor(PenColors.getRandomColor());
		tortoise.move(height);
		if(height <= 200) {
			//Peaked Roof
			tortoise.turn(30);
			tortoise.move(25);
			tortoise.turn(120);
			tortoise.move(25);
			tortoise.turn(30);
		}
		else {
			//Flat Roof
			tortoise.turn(90);
			tortoise.move(30);
			tortoise.turn(90);
		}
		tortoise.move(height);
		tortoise.turn(-90);
		//Grass
		Color grass = new Color(000, 187, 119);
		tortoise.setPenColor(grass);
		tortoise.move(20);
		tortoise.turn(-90);
	}
}
