import java.util.Scanner;
import java.util.Random;

public class HighLow {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		int userGuess = 0;
		int numberOfGuesses = 0;
		int maxNumberOfGuesses = 10;
		System.out.println("Welcome to the High Low Game!");
		System.out.println("I'm thinking of a number between 1 and 100");
		System.out.println("Can you guess it?");
		do {
			System.out.println("Enter a number between 1 and 100");
			userGuess = scanner.nextInt();
			numberOfGuesses++;
			if (userGuess > 100 || userGuess < 1) {
				System.out.println("Invalid input");
			} else if (userGuess > randomNumber) {
				System.out.println("LOWER");
				System.out.println("You have " + (maxNumberOfGuesses - numberOfGuesses) + " guesses left.");
			} else if (userGuess < randomNumber) {
				System.out.println("HIGHER");
				System.out.println("You have " + (maxNumberOfGuesses - numberOfGuesses) + " guesses left.");
			} else {
				System.out.println("GOOD GUESS!");
				System.out.println("It took you " + numberOfGuesses + " guesses.");
			}
		} while (userGuess != randomNumber && numberOfGuesses < maxNumberOfGuesses);
		if (numberOfGuesses == maxNumberOfGuesses) {
			System.out.println("You lose!");
			System.out.println("The number was " + randomNumber);
			System.out.println("Want to play again? (y/n)");
			String playAgain = scanner.next();
			if (playAgain.equalsIgnoreCase("y")) {
				main(args);
			} else {
				System.out.println("Thanks for playing!");
			}
		} else {
			System.out.println("Want to play again? (y/n)");
			String playAgain = scanner.next();
			if (playAgain.equalsIgnoreCase("y")) {
				main(args);
			} else {
				System.out.println("Thanks for playing!");
			}
		}
	}
}
