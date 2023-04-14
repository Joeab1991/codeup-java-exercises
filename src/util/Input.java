package util;

import java.util.Scanner;

public class Input {
	//Create an input validation class
	//
	//Create a package inside of src named util. Inside of util, create a class named Input that has a private field
	// named scanner. When an instance of this object is created, the scanner field should be set to a new instance of
	// the Scanner class. The class should have the following methods, all of which return command line input from the user:
	//
	//String getString()
	//boolean yesNo()
	//int getInt(int min, int max)
	//int getInt()
	//double getDouble(double min, double max)
	//double getDouble()
	//The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
	//
	//The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the
	// min and max. The getDouble method should do the same thing, but with decimal numbers.
	//
	//Create another class named InputTest that has a static main method that uses all the methods from the Input class.
	//
	//Bonus
	//
	//Allow all of your methods for getting input to accept an optional String parameter named prompt. If passed, the
	// method should show the given prompt to the user before parsing the input.

	private static Scanner scanner = new Scanner(System.in);

	public static String getString( ) {
		String input = scanner.nextLine();
		if (input.isBlank()) {
			return getString();
		} else {
			return input;
		}
	}

	public static String getString(String prompt) {
		System.out.println(prompt);
		return getString();
	}

	public static boolean yesNo() {
		String input = getString();
		if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
			return true;
		} else if (input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no")){
			return false;
		} else {
			System.out.println("Please enter yes or no.");
			return yesNo();
		}
	}

	public static boolean yesNo(String prompt) {
		System.out.println(prompt);
		return yesNo();
	}

	public static int getInt(int min, int max) {
		int input = getInt();
		while (input < min || input > max) {
			System.out.println("Please enter a number between " + min + " and " + max + ".");
			input = getInt();
		}
		return input;
	}

	public static int getInt() {
		while (!scanner.hasNextInt()) {
			System.out.println("Please enter a valid number.");
			scanner.next();
		}
		return scanner.nextInt();
	}

	public static int getInt(String prompt, int min, int max) {
		System.out.println(prompt);
		return getInt(min, max);
	}


	public static double getDouble(double min, double max) {
		double input = getDouble();
		while (input < min || input > max) {
			System.out.println("Please enter a number between " + min + " and " + max + ".");
			input = getDouble();
		}
		return input;
	}

	public static double getDouble() {
		while (!scanner.hasNextDouble()) {
			System.out.println("Please enter a valid number.");
			scanner.next();
		}
		return scanner.nextDouble();
	}

	public static double getDouble(String prompt, double min, double max) {
		System.out.println(prompt);
		return getDouble(min, max);
	}

}
