package DaysTenAndUp.Day10;

import org.teachingextensions.logo.Tortoise;

import java.awt.Color;
import org.teachingextensions.logo.PenColors;

public class HousesString {
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
		drawHouse("big");
		drawHouse("small");
		drawHouse("small");
		drawHouse("big");
		drawHouse("big");
		drawHouse("small");
		for (int i = 0; i < 3; i++) {
			drawHouse("big");
		}
		for (int i = 0; i < 4; i++) {
			drawHouse("medium");
		}
	}
	@SuppressWarnings("static-access")
	public static void drawHouse(String size) {
		tortoise.penDown();
		tortoise.setPenColor(PenColors.getRandomColor());
		if(size.equals("small")) {
			//200 Pixels Tall
			tortoise.move(200);
			//Peaked Roof
			drawPeak();
		}
		else if(size.equals("big")){
			//Tall, 400 Pixels
			tortoise.move(400);
			//Flat Roof
			drawFlat();
		}
		else {
			tortoise.move(300);
			med();
		}
		tortoise.turn(-90);
		//Grass
		Color grass = new Color(000, 187, 119);
		tortoise.setPenColor(grass);
		tortoise.move(20);
		tortoise.turn(-90);
	}
	@SuppressWarnings("static-access")
	public static void drawFlat() {
		tortoise.turn(90);
		tortoise.move(30);
		tortoise.turn(90);
		tortoise.move(400);
	}
	@SuppressWarnings("static-access")
	public static void drawPeak() {
		tortoise.turn(30);
		tortoise.move(25);
		tortoise.turn(120);
		tortoise.move(25);
		tortoise.turn(30);
		tortoise.move(200);
	}
	@SuppressWarnings("static-access")
	public static void med() {
			tortoise.turn(30);
			tortoise.move(25);
			tortoise.turn(120);
			tortoise.move(25);
			tortoise.turn(30);
			tortoise.move(300);
	}
}