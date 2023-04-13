package rpg;

import RandomName.RandomName;

public class Main {
	public static void main(String[] args) {
		Fighter fighterNolan = new Fighter();
		fighterNolan.setName("Nolan");
		fighterNolan.setHitPoints(10);
		fighterNolan.setMaxDamage(10);
		fighterNolan.setFocus(10);
		fighterNolan.printStats();

		Fighter fighterCody = new Fighter("Cody", 10, 10, 10);
		fighterCody.printStats();

		Fighter fighterDylan = new Fighter("Dylan");
		fighterDylan.printStats();

		Fighter randomFighter = new Fighter(RandomName.getName());
		randomFighter.printStats();
	}
}
