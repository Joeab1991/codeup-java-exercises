package RandomName;

import util.utils;

public class RandomName {
	public static String getRandomName() {
		String[] names = {"Abby", "Bella", "Coco", "Daisy", "Ella", "Fiona", "Ginger", "Hazel", "Ivy", "Jasmine", "Kiki",
				"Lily", "Molly", "Nala", "Olive", "Penny", "Quinn", "Ruby", "Sadie", "Tilly", "Uma", "Violet", "Winnie",
				"Xena", "Yuki", "Zoe", "Joe", "Bob", "Bill", "Tom", "Tim", "Jim", "John", "Jack", "Mike", "Steve", "Rob",
				"Rick", "Fred", "Frank", "Harry", "Henry", "Sam", "Sammy", "Will", "Willie", "Bill", "Billy", "Ted",
				"Teddy", "Tommy", "Steven", "Steve", "Stevie", "Stan", "Stanley", "Octavious", "Oscar", "Ollie", "Oliver",
				"Nolan", "Nate", "Nathan", "Nathaniel"};
		int randomIndex = utils.getRandomNumber(0, names.length - 1);
		return names[randomIndex];
	}
}
