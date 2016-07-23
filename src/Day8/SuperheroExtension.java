package Day8;

import java.util.ArrayList;

public class SuperheroExtension {
	public static void main(String[] args){
		Superhero urmom = new Superhero();
		urmom.setName("urmom");
		urmom.setPower("Making you do chores/clean room/homework at the least convient times.");
		urmom.getName();
		urmom.getPower();
		Superhero Boris_Johnson = new Superhero();
		Boris_Johnson.setName("Boris Johnson");
		Boris_Johnson.setPower("Brexiting");
		Boris_Johnson.getName();
		Boris_Johnson.getPower();
		Superhero Dalia_aka_Illuminati_Confirmed_who_Cheats_at_Walking_and_Eats_Way_Too_Many_Pretzels = new Superhero();
		Dalia_aka_Illuminati_Confirmed_who_Cheats_at_Walking_and_Eats_Way_Too_Many_Pretzels.setName("Dalia");
		Dalia_aka_Illuminati_Confirmed_who_Cheats_at_Walking_and_Eats_Way_Too_Many_Pretzels.setPower("Cheating at walking (very skilled) and eating pretzels.");
		Dalia_aka_Illuminati_Confirmed_who_Cheats_at_Walking_and_Eats_Way_Too_Many_Pretzels.getName();
		Dalia_aka_Illuminati_Confirmed_who_Cheats_at_Walking_and_Eats_Way_Too_Many_Pretzels.getPower();
		urmom.sayisevil();
		Boris_Johnson.sayisevil();
		Dalia_aka_Illuminati_Confirmed_who_Cheats_at_Walking_and_Eats_Way_Too_Many_Pretzels.sayisevil();
		ArrayList<Superhero> evilpeeps = new ArrayList<Superhero>();
		evilpeeps.add(urmom);
		evilpeeps.add(Boris_Johnson);
		evilpeeps.add(Dalia_aka_Illuminati_Confirmed_who_Cheats_at_Walking_and_Eats_Way_Too_Many_Pretzels);
		System.out.println(evilpeeps.get(0));
		System.out.println(evilpeeps.get(1));
		System.out.println(evilpeeps.get(2));
		speak("Dalia AKA Illuminati Confirmed who cheats at walking and eats way too many pretzels");
	}
		static void speak(String words) {
		   	 try {
		   		 Runtime.getRuntime().exec("say " + words).waitFor();
		   	 } catch (Exception e) {
		   		 e.printStackTrace();
		   	 }
		    }

	}

