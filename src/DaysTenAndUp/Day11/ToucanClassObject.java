package DaysTenAndUp.Day11;

public class ToucanClassObject {
	String type;
	String name;
	int age;
	int guavas = 0;
	boolean fat = false;
	boolean dead = false;
	ToucanClassObject(String type, int age, String name) {
		this.type = type;
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		ToucanClassObject toucan = new ToucanClassObject("toco", 10, "Tim");
		toucan.squawk();
		for(int i = 0; i < 8; i++) {
			toucan.eatFruit();
		}
		toucan.eatEggs();
		toucan.fly();
		toucan.eatFruit();
		toucan.eatFruit();
		toucan.fly();
	}
	
	void squawk() {
		System.out.println("Squawk!");
	}
	void eatFruit() {
		System.out.println("Eating a guava...");
		guavas++;
		if(guavas > 9) {
			System.out.println("Too fat to fly!");
			fat = true;
		}
	}
	void eatEggs() {
		System.out.println("Ate eggs... Yum.");
	}
	void fly() {
		if(fat == false) {
			System.out.println("I believe I can fly!");
		}
		else {
			System.out.println(name + " fell from the sky and died.");
			dead = true;
		}
	}
	void sleep() {
		System.out.println("Zzz...");
		guavas =- 3;
	}
	public void setGuavas(int guavas) {
		this.guavas = guavas;
	}
	public int getGuavas() {
		return guavas;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		System.out.println("I am " + age + " years old.");
		return age;
	}
	public String getName() {
		System.out.println("My name is " + name + ".");
		return name;
	}
	public boolean getDead() {
		return dead;
	}
}
//This is the last line!