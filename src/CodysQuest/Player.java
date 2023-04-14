package CodysQuest;
import java.util.Arrays;

public class Player extends Character{
	// ints to store number of attack skills in each category
	public int HTMLAttacksNum;
	public int CSSAttacksNum;
	public int JSAttacksNum;
	public int JavaAttacksNum;
	public int inventoryNum;
	// String to store the current location of the player
	public String currentLocation;

	// Arrays to store attacks
	public static String[] HTMLAttacks = {"DIV Sauce", "Header Havoc", "Form Frenzy", "DOMination"};
	public static String[] CSSAttacks = {"Selector Strike", "Box Model Blitz", "Bootstrap Barrage", "Display:Flex"};
	public String[] JSAttacks = {"Console.log", "Void Function", "Infinite Loop", "Constructor"};
	public String[] JavaAttacks = {"Stack Overflow", "Class Thrash", "Recursion", "Method Madness"};
	public String[] inventory = {"", "", "", "", ""};



	// Player specific constructor
	public Player(String name) {
		// Call the constructor of the parent class
		super(name, 100, 0);
		// Set the number of attacks for each category
		HTMLAttacksNum = 1;
		CSSAttacksNum = 0;
		JSAttacksNum = 0;
		JavaAttacksNum = 0;
		inventoryNum = 0;
		// players current location
		currentLocation = "The Pedernales Classroom";
		// let the player choose an additional attack upon creation
		learnAttack();
		addToInventory("Cup O' Joe");
	}

	public void getInventory() {
		for (int i = 0; i < inventoryNum; i++) {
			System.out.print(inventory[i]+" | ");
		}
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String newLocation) {
		this.currentLocation = newLocation;
	}

	public void addToInventory(String item) {
		if (this.inventoryNum > 5) {
			System.out.println("You can't carry any more items!");
		} else {
			inventory[this.inventoryNum] = item;
			this.inventoryNum++;
		}
	}

	public String getStats() {
		return "Name: "+this.name+" | Focus: "+this.focus+"/"+this.maxFocus+" | Current XP: " + this.xp;
	}

	public String getName() {
		return this.name;
	}

//	public String getKnownAttacks() {
//		if (HTMLAttacksNum > 0) {
//			for (int i = 0; i < HTMLAttacksNum; i++) {
//				System.out.println("HTML Attacks: " + HTMLAttacks[1]);
//			}
//		} else if (CSSAttacksNum > 0) {
//			return "CSS Attacks: " + Arrays.toString(CSSAttacks);
//		} else if (JSAttacksNum > 0) {
//			return "JS Attacks: " + Arrays.toString(JSAttacks);
//		} else if (JavaAttacksNum > 0) {
//			return "Java Attacks: " + Arrays.toString(JavaAttacks);
//		} else {
//			return "You have no known attacks!";
//		}
//	}
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
				// increment the number of HTML attacks the player has learned
				HTMLAttacksNum++;
				// print the attack the player has learned
				System.out.println("You have learned the attack: "+HTMLAttacks[HTMLAttacksNum]+"!");
			}
		} else if (input == 2) {
			if (CSSAttacksNum == CSSAttacks.length) {
				System.out.println("You have already learned all the CSS attacks!");
				GameLogic.waitForUser();
				GameLogic.clearConsole();
				learnAttack();
			} else {
				CSSAttacksNum++;
				System.out.println("You have learned the attack: "+CSSAttacks[CSSAttacksNum]+"!");
			}
		}
	}



}
