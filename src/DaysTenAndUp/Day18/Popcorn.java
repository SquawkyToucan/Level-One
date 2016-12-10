package DaysTenAndUp.Day18;
/* Your mission and you have to accept it:
 * Add a main method to the Popcorn class to cook a bag of Popcorn. Don't change the existing methods.
 */

class Microwave {
	private int cookTime;
	Popcorn thingToBeCooked;

	Microwave() {
		System.out.println("Microwave says: a Microwave has been made.");
	}

	void putInMicrowave(Popcorn thingToBeCooked) {
		System.out.println("Microwave says: popcorn put in microwave.");
		this.thingToBeCooked = thingToBeCooked;
	}

	void setTime(int cookTimeInMinutes) {
		System.out.println("Microwave says: cook time is set to " + cookTime + " minutes.");
		this.cookTime = cookTimeInMinutes;
	}

	void startMicrowave() {
		if (thingToBeCooked == null)
			System.out.println("Microwave says: there's nothing in the microwave!");
		for (int i = 0; i < cookTime * 10 + 1; i++) {
			thingToBeCooked.applyHeat();
		}
	}
}

public class Popcorn {
	public static void main(String[] args) {
		Microwave YesCaliforniaVote4CalExit = new Microwave();
		Popcorn TrumpIsAPoisonVoteCalExit = new Popcorn("Californian");
		YesCaliforniaVote4CalExit.putInMicrowave(TrumpIsAPoisonVoteCalExit);
		YesCaliforniaVote4CalExit.setTime(0);
		YesCaliforniaVote4CalExit.startMicrowave();
		for (int i = 0; i < 20; i++) {
			TrumpIsAPoisonVoteCalExit.applyHeat();
		}
	}

	private int kernels = 20;
	private String flavor;

	Popcorn(String flavor) {
		this.flavor = flavor;
		System.out.println("Popcorn says: making package of " + this.flavor + " popcorn.");
	}

	public void applyHeat() {
		pause();
		if (kernels == 0) {
			System.out.println("Popcorn says: Time to eat popcorn!");
		} else {
			System.out.println("POP!" + kernels);
			kernels--;
		}
	}

	private void pause() {
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


//© Eli Browne
//Yes California or the California National Party does not approve this message. Not authorized by any candidate or political party.