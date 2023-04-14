package CodysQuest;

import static CodysQuest.GameLogic.player;

// class that only stores methods to print out the story
public class Story {
	public static void printIntro() {
		GameLogic.clearConsole();
		GameLogic.printHeading("Part 1: The Descent");
		GameLogic.printSeparator(50);
		System.out.println("You are a student at Codeup, staying late once again.");
		System.out.println("\"Ugh, why do I do this to myself. I'm the only one who stays until the building closes" +
				" everyday...\"");
		System.out.println("You sigh and look around the room. You're the only one left. Besides your faithful paired" +
				" programming partner, Cody, of course.");
		System.out.println("You look over at Cody and see him staring at you. \"Hey, you still here? I need help " +
				"understanding recursion!\"");
		System.out.println("You sigh again. \"If only you could talk...\"");
		System.out.println("Your eyes start to droop and you feel yourself drifting. You fantasize about " +
				"making a rubber duck that uses ChatGPT to talk back and help you debug your code.");
		System.out.println("Suddenly, you hear a voice calling your name. \"Hey, "+ player.name + "! Wake up!\"");
		GameLogic.waitForUser();
	}
}
