package CodysQuest;

public class Player extends Character{

	// ints to store number of attack skills in each category
	public int HTMLAttacksNum;
	public int CSSAttacksNum;
	public int JSAttacksNum;
	public int JavaAttacksNum;

	// Arrays to store attacks
	public static String[] HTMLAttacks = {"DIV Sauce", "Header Havoc", "Form Frenzy", "DOMination"};
	public static String[] CSSAttacks = {"Selector Strike", "Box Model Blitz", "Bootstrap Barrage", "Display:Flex"};
	public String[] JSAttacks = {"Console.log", "Void Function", "Infinite Loop", "Constructor"};

	public String[] JavaAttacks = {"Stack Overflow", "Class Thrash", "Recursion", "Method Madness"};

	// Player specific constructor
	public Player(String name) {
		// Call the constructor of the parent class
		super(name, 100, 0);
		// Set the number of attacks for each category
		HTMLAttacksNum = 0;
		CSSAttacksNum = 0;
		this.JSAttacksNum = 0;
		this.JavaAttacksNum = 0;

		// let the player choose an additional attack upon creation and lvl up
		learnAttack();
	}

	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int useItem() {
		// TODO Auto-generated method stub
		return 0;
	}

	// Method to choose an attack
	public void learnAttack() {
		GameLogic.clearConsole();
		GameLogic.printHeading("Choose an attack to learn!");
		System.out.println("Available languages:");
		System.out.println("1. HTML: "+ "| "+HTMLAttacks[HTMLAttacksNum]+" |");
		System.out.println("2. CSS:  "+ "| "+CSSAttacks[CSSAttacksNum]+" |");
		// get the players choice
		int input = GameLogic.getIntegerInput("-> ", 1, 2);
		GameLogic.clearConsole();
		// if the player chose HTML
		if (input == 1) {
			// if the player has already learned all the HTML attacks
			if (HTMLAttacksNum == HTMLAttacks.length) {
				System.out.println("You have already learned all the HTML attacks!");
				GameLogic.waitForUser();
				GameLogic.clearConsole();
				learnAttack();
			}
			// if the player has not learned all the HTML attacks
			else {
				// print the attack the player has learned
				System.out.println("You have learned the attack: "+HTMLAttacks[HTMLAttacksNum]+"!");
				// increment the number of HTML attacks the player has learned
				HTMLAttacksNum++;
			}
		} else if (input == 2) {
			if (CSSAttacksNum == CSSAttacks.length) {
				System.out.println("You have already learned all the CSS attacks!");
				GameLogic.waitForUser();
				GameLogic.clearConsole();
				learnAttack();
			} else {
				System.out.println("You have learned the attack: "+CSSAttacks[CSSAttacksNum]+"!");
				CSSAttacksNum++;
			}
		}
		GameLogic.waitForUser();
	}

}
