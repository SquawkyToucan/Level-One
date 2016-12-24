package House;

import java.util.Random;

public class HouseBuild {
	public static void main(String[] args) {
		Häuse hi = new Häuse();
		hi.start();
		while(true) {
			hi.penDown();
			int idk = new Random().nextInt(600);
			hi.drawHouse(idk);
		}
	}
}
