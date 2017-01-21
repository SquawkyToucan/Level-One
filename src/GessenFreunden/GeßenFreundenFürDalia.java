package GessenFreunden;

public class GeßenFreundenFürDalia {
	public static void main(String[] args){
    Classmate yashwin = new Classmate("Yashwin magt Memes und schriebst um Handen. Er ist nicht Normal.");
    Classmate dalia = new Classmate("Dalia ist sehr schlecht. Sie lauft nicht. Sie ist ein Insekt. Sie gewwint niemals.");
    Classmate grant = new Classmate("Grant ist die Zweite Stück aus \"Grithan.\"");
    Classmate brooke = new Classmate("Wir haben kein Information.");
    Classmate realdalia = new Classmate("SIE IST SEHR DOOF UND EIN poppa");
    System.out.println("Yashwin: " + yashwin.getFacts());
    System.out.println("Grant: " + grant.getFacts());
    System.out.println("Brooke: " + brooke.getFacts());
    System.out.println("Dalia: " + dalia.getFacts());
    System.out.println("Other Version of Dalia: " + realdalia.getFacts());
   	 //5. Use your getter to print out each description
	}
}
class Classmate{
	String description;
	Classmate(String description) {
		this.description = description;
	}
	public String getFacts() {
		return description;
	}
}