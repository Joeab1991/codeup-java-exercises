import java.util.Scanner;

public class MethodsExercises {
	public static void main(String[] args) {
//		System.out.println(addition(1, 2));
//		System.out.println(subtraction(1, 2));
//		System.out.println(multiplication(1, 2));
//		System.out.println(multiplicationRecursion(4, 3));
//		System.out.println(division(4, 1));
//		System.out.println(modulus(2, 2));
		factorial();
//		diceRoll();

	}
	public static int addition(int a, int b) {
		return a + b;
	}
	public static int subtraction(int a, int b) {
		return a - b;
	}
	public static int multiplication(int a, int b) {
		for (int i = 1; i < b; i++) {
			a += a;
		}
		return a;
	}

	public static int multiplicationRecursion(int a, int b) {
		if (b == 1) {
			return a;
		}
		return a + multiplicationRecursion(a, b - 1);
	}

	public static int division(int a, int b) {
		return a / b;
	}
	public static int modulus(int a, int b) {
		return a % b;
	}

	public static int getInteger(int min, int max) {
		System.out.println("Enter a number between " + min + " and " + max);
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		if (userInput >= min && userInput <= max) {
			return userInput;
		} else {
			System.out.println("Invalid input");
			return getInteger(min, max);
		}
	}

	public static void factorial() {
		int userInput = getInteger(1, 20);
		long result = factorial(userInput);
		System.out.println(result);
		System.out.println("Do you want to continue? [y/n]");
		Scanner scanner = new Scanner(System.in);
		String continueOrNot = scanner.next();
		factorial(continueOrNot);
	}
	public static long factorial(int userInput) {
		if (userInput == 1) {
			return 1;
		} else {
			return userInput * factorial(userInput - 1);
		}
	}

	public static void factorial (String continueOrNot) {
		if (continueOrNot.equalsIgnoreCase("y")) {
			factorial();
		} else if (continueOrNot.equalsIgnoreCase("n")) {
			System.out.println("Goodbye");
		} else {
			System.out.println("Invalid input. No more factorial for you.");
		}
	}

	public static void diceRoll() {
		System.out.println("Enter the number of sides for a pair of dice");
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		System.out.println("Rolling the dice...");
		int dice1 = (int) (Math.random() * userInput) + 1;
		int dice2 = (int) (Math.random() * userInput) + 1;
		System.out.println(dice1);
		System.out.println(dice2);
		System.out.println("Do you want to continue? [y/n]");
		String continueOrNot = scanner.next();
		if (continueOrNot.equalsIgnoreCase("y")) {
			diceRoll();
		} else if (continueOrNot.equalsIgnoreCase("n")) {
			System.out.println("Goodbye");
		} else {
			System.out.println("Invalid input. No more dice rolling for you.");
		}
	}

	public static void doYouWantToContinue () {
		System.out.println("Do you want to continue? [y/n]");
		Scanner scanner = new Scanner(System.in);
		String continueOrNot = scanner.next();
		if (continueOrNot.equalsIgnoreCase("y")) {
			diceRoll();
		} else if (continueOrNot.equalsIgnoreCase("n")) {
			System.out.println("Goodbye");
		} else {
			System.out.println("Invalid input. No more dice rolling for you.");
		}
	}
}
