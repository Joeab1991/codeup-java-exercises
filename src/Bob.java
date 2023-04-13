import java.util.Scanner;

public class Bob {
	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Say something to Bob");
			String userInput = scanner.nextLine();
			if (userInput.toUpperCase().equals(userInput) && !userInput.isBlank()) {
				System.out.println("Bob attacks you with his fists!");
				System.out.println("You are dead.");
				break;
			} else if (userInput.endsWith("!")) {
				System.out.println("Bob says," + "\"Whoa, chill out!\"");
			} else if (userInput.isBlank()) {
				System.out.println("Bob says," + "\"Fine. Be that way!\"");
			} else if (userInput.equalsIgnoreCase("bye")) {
				System.out.println("Bob says," + "\"Later, bro.\"");
				break;
			} else if (userInput.endsWith("?")) {
				System.out.println("Bob says," + "\"Sure.\"");
			} else {
				System.out.println("Whatever");
			}
			System.out.println("Are you done talking to Bob?");
			String userResponse = scanner.nextLine();
			if (userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
				System.out.println("Goodbye");
				break;
			}
		}
	}
}
