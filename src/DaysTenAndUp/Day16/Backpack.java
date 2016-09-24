package DaysTenAndUp.Day16;

public class Backpack {

	private static Pencil pencil;
	private static Ruler ruler;
	private static Textbook textbook;

	Backpack() {
		System.out.println("Nice Backpack");
	}

	public static void main(String[] args) {
		Backpack tooooHeavy = new Backpack();
		tooooHeavy.putInBackpack(textbook = new Textbook());
		tooooHeavy.putInBackpack(pencil = new Pencil());
		tooooHeavy.putInBackpack(ruler = new Ruler());
		tooooHeavy.goToSchool();
	}

	public void putInBackpack(Supply supply) {
		if (supply instanceof Pencil) {
			this.pencil = (Pencil) supply;
			System.out.println("You put your pencil in your Backpack");
		} else if (supply instanceof Ruler) {
			this.ruler = (Ruler) supply;
			System.out.println("You put your ruler in your Backpack");
		} else if (supply instanceof Textbook) {
			this.textbook = (Textbook) supply;
			System.out.println("You put your textbook in your Backpack");
		} else {
			System.out.println("That isn't a valid school supply");
		}
	}

	public void goToSchool() {
		if (pencil == null || ruler == null || textbook == null) {
			System.err.println("You are not ready for School.");
			System.out.println("BUT...");
			System.out.println("Don't worry, be happy about it!");
		} else {
			System.out.println("Congratulations! You are ready for school");
		}
	}
}

class Supply {
	protected String name;
}

class Pencil extends Supply {

	Pencil() {
		this.name = "pencil";
		System.out.println("You got your pencil!");
	}

	public void write(String writing) {
		System.out.println(writing);
	}
}

class Ruler extends Supply {

	Ruler() {
		this.name = "ruler";
		System.out.println("You found your ruler!!");
	}

	public void measure() {
		System.out.println("Now you can measure your mouse!");
	}
}

class Textbook extends Supply {

	Textbook() {
		this.name = "textbook";
		System.out.println("You got your boring textbook");
	}

	public void read() {
		System.out.println("The history of Iceland is long and interesting");
	}
}
