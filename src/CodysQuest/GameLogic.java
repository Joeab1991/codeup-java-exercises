package CodysQuest;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class GameLogic {
	public static Scanner scanner = new Scanner(System.in);
	public static Player player;
	public static boolean gameRunning;


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
			name = Input.getString();
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
		scanner.nextLine();
		waitForUser();
		clearConsole();
		printHeading("You have much to learn about coding, " + player.getName() + "!\nBest of luck on your journey!");
		waitForUser();

		gameRunning = true;
		// start the game loop
		gameLoop();
	}

	public static void gameLoop() {
		while (gameRunning) {
			// print the main menu
			Story.printIntro();
			clearConsole();
			printHeading("Main Menu");
			System.out.println("1. View Stats");
			System.out.println("2. View Inventory");
			System.out.println("3. Navigation");
			System.out.println("4. Exit Game");
			int choice = getIntegerInput("-> ", 1, 4);
			switch (choice) {
				case 1 -> {
					// view stats
					clearConsole();
					printHeading("Stats");
					System.out.println(player.getStats());
//					System.out.println(player.knownAttacks());
					scanner.nextLine();
					waitForUser();
				}
				case 2 -> {
					// view inventory
					clearConsole();
					printHeading("Inventory");
					player.getInventory();
					scanner.nextLine();
					waitForUser();
				}
				case 3 -> {
					// Game Navigation
					clearConsole();
					printHeading("Navigation");
					System.out.println("You are at "+player.getCurrentLocation()+".");
					System.out.println("Where would you like to go?");
					printSeparator(50);
					System.out.println("1. Go to the Big Bend Classroom");
					System.out.println("2. Go to the Enchanted Rock Shark Tank");
					System.out.println("3. Go to the Zenith Lounge");
					System.out.println("4. Go to the Hallway");
					System.out.println("5. Go to the Bathroom");
					System.out.println("6. Go to the Mustang Island Room");
					System.out.println("7. Go to the Blanco Classroom");
					System.out.println("8. Go to the Elevator");
					System.out.println("9. Go to the Abandoned Lounge");
					scanner.nextLine();
					waitForUser();
				}
				case 4 -> {
					// exit game
					clearConsole();
					if (Input.yesNo("Are you sure you want to exit the game? [y/n]")) {
						clearConsole();
						printHeading("Thanks for playing!");
						gameRunning = false;
					}
				}
			}
		}
	}
}
