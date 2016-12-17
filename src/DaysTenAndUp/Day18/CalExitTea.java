package DaysTenAndUp.Day18;

//Copyright Wintriss Technical Schools 2013
public class CalExitTea {

	/* Figure out how to make a cup of tea using the classes below */
	public static void main(String[] args) {
		TeaBag CalExit2016 = new TeaBag("Caleavefornia");
		Kettle VoteCalNP = new Kettle();
		VoteCalNP.boil();
		Cup mehcup = new Cup();
		System.out.println("The flavor of tea is " + CalExit2016.getFlavor());
		mehcup.makeTea(CalExit2016, VoteCalNP.getWater());
	}
}

class TeaBag {

	public final static String YESCALIFORNIA = "Yes California";
	public final static String CALEXIT = "CalExit";
	public final static String CALEAVEFORNIA = "Caleavefornia";
	public final static String PASSIONAGAINSTTRUMP = "Passion Against Trump";

	private String flavor;

	TeaBag(String flavor) {
		this.flavor = flavor;
	}

	String getFlavor() {
		return flavor;
	}

}

class Kettle {

	private Water water = new Water();

	Water getWater() {
		return water;
	}

	void boil() {
		this.water.isHot = true;
	}

	class Water {

		private boolean isHot = false;

		public boolean isHot() {
			return this.isHot;
		}
	}

}

class Cup {

	void makeTea(TeaBag teabag, Kettle.Water hotWater) {
		if (hotWater.isHot())
			System.out.println("Making hot " + teabag.getFlavor() + " tea.");
		else
			System.out.println("Can't make tea with cold water! ");
	}

}
