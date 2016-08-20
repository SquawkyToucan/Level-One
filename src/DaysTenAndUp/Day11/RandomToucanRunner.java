package DaysTenAndUp.Day11;
import java.util.Random;

public class RandomToucanRunner {
	public static void main(String[] args) {
		ToucanClassObject random = new ToucanClassObject("White Throated/Red Billed", 6, "Bill");
		for(;true;) {
			int whatToDo = new Random().nextInt(4);
			if(random.getDead() == false) {
				if(whatToDo == 0) {
					random.eatEggs();
				}
				if(whatToDo == 1) {
					random.eatFruit();
				}
				if(whatToDo == 2) {
					random.fly();
				}
				if(whatToDo == 3) {
					random.sleep();
				}
			}
			else {
				System.out.println("Toucan is dead!");
				System.exit(0);
			}
		}
	}
}
