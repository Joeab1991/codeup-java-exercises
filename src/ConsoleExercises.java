import java.util.Scanner;

public class ConsoleExercises {
	public static void main(String[] args) {
//		double pi = 3.14159;
//		System.out.format("The value of pi is approximately %.2f.%n", pi);
//
		Scanner scanner = new Scanner(System.in);
//		scanner.useDelimiter("\n");
//		System.out.print("Enter an integer: ");
//		int userInt = scanner.nextInt();
//		System.out.println("You entered: --> \"" + userInt + "\" <--");
//
//		System.out.print("Enter three words: ");
//		String word1 = scanner.next();
//		String word2 = scanner.next();
//		String word3 = scanner.next();
//		System.out.println("You entered: --> \"" + word1 + "\" \"" + word2 + "\" \"" + word3 + "\" <--");
//
//		System.out.print("Enter a sentence: ");
//		scanner.nextLine();
//		String sentence = scanner.nextLine();
//		System.out.println("You entered: --> \"" + sentence + "\" <--");

//

		//### Bonus exercises -- from Justin Reich
		//
		//1. Prompt the user to enter a favorite quote
		//    - output the quote
		//    - ask them to enter how many words are in the quote
		//    - output the number they entered
		//    - output if the number they entered indeed matched the number of words
		//
		//2. Prompt the user to enter a list of top three favorite foods separated by only spaces
		//
		//    - Use the printf() to output the three top foods with the format:
		//        1. FirstFood
		//        2. SecondFood
		//        3. ThirdFood
		//
		//3. Prompt the user to enter a grocery list of three items
		//    - each item should only be separated by a comma (no spaces)
		//    - you will need to use the .useDelimiter() method on your scanner object
		//    - output the result as a comma-separated list using printf()

//		System.out.print("Enter a favorite quote: ");
//		scanner.nextLine();
//		String quote = scanner.nextLine();
//		System.out.println("You entered: --> \"" + quote + "\" <--");
//		System.out.print("How many words are in the quote? ");
//		int wordCount = scanner.nextInt();
//		System.out.println("You entered: --> \"" + wordCount + "\" <--");
//		System.out.println("The number you entered " + (wordCount == quote.split(" ").length ? "matches" : "does not match") + " the number of words in the quote.");
//
//		System.out.print("Enter a list of your top three favorite foods, separated by spaces: ");
//		String foods = scanner.nextLine();
//		System.out.println("You entered: --> \"" + foods + "\" <--");
//		String[] foodArray = foods.split(" ");
//		System.out.printf("1. %s %n2. %s %n3. %s %n", foodArray[0], foodArray[1], foodArray[2]);

		System.out.print("Enter a grocery list of three items: ");
		scanner.useDelimiter(",");
		String item1 = scanner.next();
		String item2 = scanner.next();
		String item3 = scanner.next();
		System.out.printf("You entered: --> \"%s,%s,%s\" <--%n", item1, item2, item3);

	}
}
