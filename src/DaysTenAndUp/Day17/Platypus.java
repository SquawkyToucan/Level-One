package DaysTenAndUp.Day17;

public class Platypus {
	private String name;
	void sayHi(){
		System.out.println("The platypus " + name + " is dumber than your average platypus.");
	}
	void doMath(){
		System.out.println("The platypus " + name + " has made the claim that 2 + 2 = 5.");
	}
	void snore() {
		System.out.println(name + " is being lazy and snoring.");
	}
	Platypus(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		Platypus Dalia = new Platypus("Dalia");
		Dalia.sayHi();
		Dalia.doMath();
		Dalia.snore();
	}
}



