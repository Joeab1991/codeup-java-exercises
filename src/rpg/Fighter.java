package rpg;

public class Fighter {

	private String name;
	private int hitPoints = 14;
	private int maxDamage = 10;
	private int focus = 10;

	public static int armorClass = 10;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getMaxDamage() {
		return maxDamage;
	}

	public void setMaxDamage(int maxDamage) {
		this.maxDamage = maxDamage;
	}

	public int getFocus() {
		return focus;
	}

	public void setFocus(int focus) {
		this.focus = focus;
	}

	public Fighter() {
	}

	public Fighter(String name) {
		this.name = name;
	}

	public Fighter(String name, int hitPoints, int maxDamage, int focus) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.maxDamage = maxDamage;
		this.focus = focus;
	}

	public void printStats() {
		System.out.printf("Fighter %s has:%nHP: %d | Max Damage: %d | Focus: %d | Armor Class: %d%n%n", name, hitPoints, maxDamage, focus, armorClass);
	}
}
