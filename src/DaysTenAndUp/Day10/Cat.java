package DaysTenAndUp.Day10;

public class Cat {

	private String name;
	private int lives = 9;

	Cat(String name) {
		this.name = name;
	}
	void findMouse(String name) {
		System.out.println("I found a mouse named " + name + "!");
	}
	void killMouse(String name) {
		System.out.println("I killed a mouse named " + name + ".");
	}
	void meow() {
		System.out.println("meeeeeooooooooooowwwwwwwww!!");
	}

	public void printName() {
		if (name == null)
			System.out.println("i don't know my own name!");
		else
			System.out.println("my name is " + name);
	}

	void kill() {
		lives--;
		if (lives > 0)
			System.out.println("nice try, but I still have " + lives + " lives left");
		else if (lives < 0)
			System.out.println("that's overkill yo!");
		else
			System.out.println("DEAD CAT :(");
	}
	void destroySofa() {
		System.out.println("I destroyed a sofa!");
		System.out.println("Blaming it on the dog...");
	}
	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */
		Cat cat = new Cat("joe");
		Cat hi = new Cat("tom");
		
		// 1. Make the Cat meow
		cat.meow();
		hi.meow();
		// 2. Get the Cat to print it's name
		cat.printName();
		cat.destroySofa();
		// 3. Kill the Cat!
		for(int i = 0; i < 12; i++) {
			cat.kill();
		}
		hi.printName();
		hi.kill();
		hi.findMouse("max");
		hi.killMouse("jerry");
	}
}


