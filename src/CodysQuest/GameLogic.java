package CodysQuest;

import java.util.Scanner;

public class GameLogic {

	static Scanner scanner = new Scanner(System.in);
	static Player player;

	public static int getIntegerInput(String prompt, int min, int max) {
		System.out.print(prompt);
		return getIntegerInput(min, max);
	}

	public static int getIntegerInput(int min, int max) {
		int input = getIntegerInput();
		while (input < min || input > max) {
			System.out.println("Please enter a number between " + min + " and " + max + ".");
			input = getIntegerInput();
		}
		return input;
	}

	public static int getIntegerInput() {
		while (!scanner.hasNextInt()) {
			System.out.println("Please enter a valid option.");
			scanner.next();
		}
		return scanner.nextInt();
	}

		// This method is used to clear the console.
	public static void clearConsole () {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
	}

	//Method to print a separator with length of n
	public static void printSeparator(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	//Additional method to print a separator with length of n with different style
	public static void printSeparatorAlt(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	// method to print a heading
	public static void printHeading(String title) {
		printSeparator(title.length());
		printSeparatorAlt(title.length());
		System.out.println(title);
		printSeparatorAlt(title.length());
		printSeparator(title.length());
	}

	// method to stop the game until the user presses any key
	public static void waitForUser() {
		System.out.println("\nPress Enter to continue...");
		scanner.nextLine();
	}

	// method for starting the game
	public static void startGame() {
		boolean nameSet = false;
		String name;
		printHeading("Welcome to Cody's Quest!\nRPG by: Joe Beltran");
		waitForUser();
		clearConsole();

		// create a new player
		do {
			clearConsole();
			printHeading("What is your name?");
			name = scanner.next();
			// ask the user if they want to use the name they entered
			printHeading("Are you sure you want to use the name " + name + "?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			int choice = getIntegerInput("-> ", 1, 2);
			if (choice == 1) {
				nameSet = true;
			}
		} while (!nameSet);

		// create a new player object with the name the user entered
		player = new Player(name);

	}
}
