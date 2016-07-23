package Day8;

public class Superhero {
	String name;
	String superpower;
	String print;
	public String getName(){
		return this.name;
	}
	public String getPower(){
		return this.superpower;
	}
	public void setName(String first){
		name = first;
	}
	public void setPower(String power){
		superpower = power;
	}
	public void sayisevil() {
		System.out.println("Superhero " + name + " is definetly evil. \n\nPROOF: \nSuperpower: " + superpower);
	}
}
