import java.util.Scanner;

public class MiniExercise {
	public static void main(String[] args) {
		System.out.println("What is your name?");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello, " + scanner.nextLine() + "!");
	}
}
