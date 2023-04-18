import java.util.Arrays;
import java.util.Scanner;

public class MiniExercise {
	public static void main(String[] args) {
//		System.out.println("What is your name?");
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Hello, " + scanner.nextLine() + "!");
//		int x = 5;
//		String y = "five";
//		System.out.println(x + y);

		String[] numbers = new String[5];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + "";
		}
		System.out.println(Arrays.toString(numbers));
		numbers[3] ="";
		for ( String number : numbers) {
			System.out.println(number);
		}

	}
}
