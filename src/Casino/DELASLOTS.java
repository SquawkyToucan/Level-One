package Casino;

import java.util.Random;

public class DELASLOTS {
	int wager;
	int num1;
	int num2;
	int num3;
	DELASLOTS(int wager) {
		this.wager = wager;
	}
	void play() {
		int onReturn = wager;
		num1 = new Random().nextInt(10000);
		num2 = new Random().nextInt(10000);
		num3 = new Random().nextInt(10000);
		if(num1 == num2 == num3) {
			
		}
	}
}
