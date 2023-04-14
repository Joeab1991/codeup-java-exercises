package CodysQuest;

public abstract class Character {

	// Variables/Attributes that all characters have
	public String name;
	public int focus, maxFocus, xp;

	// Constructor


	public Character(String name, int maxFocus, int xp) {
		this.name = name;
		this.focus = maxFocus;
		this.maxFocus = maxFocus;
		this.xp = xp;
	}


	// Methods that all characters have
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public abstract int attack();
	public abstract int useItem();
}
