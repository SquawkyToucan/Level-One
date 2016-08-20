package DaysTenAndUp.Day11;

public class ToucanRunner {
	public static void main(String[] args) {
		ToucanClassObject toucan = new ToucanClassObject("toco", 3, "Recife");
		toucan.getName();
		toucan.getAge();
		toucan.fly();
		toucan.eatEggs();
		for(int i = 0; i < 8; i++) {
			toucan.eatFruit();
		}
		toucan.fly();
		toucan.sleep();
		toucan.eatFruit();
		toucan.eatFruit();
		toucan.fly();
		for(int i = 0; i < 3; i++) {
			toucan.eatFruit();
		}
		toucan.fly();
	}
}
