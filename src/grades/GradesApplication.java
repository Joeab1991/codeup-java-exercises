package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import util.Input;
import util.utils;

import static util.Input.*;
import static util.utils.*;


public class GradesApplication {
	static HashMap <String, Student> students = new HashMap<>();

	public static String gradesAppMenu = """
			What would you like to do?
			
			0 - Exit
			1 - View all student grades
			2 - View a specific student's grades
			3 - View the Class Average
			4 - Display students GitHub usernames
			5 - Print a CSV report
			6 - View absences
		
			Enter your choice:
			""";

	public static void main(String[] args) {

		Student joe = new Student("Joe");
		Student nolan = new Student("Nolan");
		Student gabby = new Student("Gabby");
		Student sammy = new Student("Samson");

		joe.addGrades(new ArrayList<Integer>(List.of(85,95,75)));
		nolan.addGrades(new ArrayList<Integer>(List.of(75,63,97)));
		gabby.addGrades(new ArrayList<Integer>(List.of(85,95,92)));
		sammy.addGrades(new ArrayList<Integer>(List.of(65,45,70)));

		students.put("joeab19", joe);
		students.put("Baba", nolan);
		students.put("nagallday92", gabby);
		students.put("AnnoyingC8t23", sammy);

		joe.recordAttendance(2023, 1, 1, "A");
		joe.recordAttendance(2023, 1, 2, "P");
		joe.recordAttendance(2023, 1, 3, "P");
		joe.recordAttendance(2023, 1, 4, "P");
		joe.recordAttendance(2023, 1, 5, "P");
		joe.recordAttendance(2023, 1, 6, "P");
		joe.recordAttendance(2023, 1, 7, "P");
		joe.recordAttendance(2023, 1, 8, "A");

		nolan.recordAttendance(2023, 1, 1, "P");
		nolan.recordAttendance(2023, 1, 2, "P");
		nolan.recordAttendance(2023, 1, 3, "P");
		nolan.recordAttendance(2023, 1, 4, "P");
		nolan.recordAttendance(2023, 1, 5, "P");
		nolan.recordAttendance(2023, 1, 6, "P");
		nolan.recordAttendance(2023, 1, 7, "P");
		nolan.recordAttendance(2023, 1, 8, "A");


		printHeading("Welcome to the Students Application!");
		waitForUser();
		clearConsole();
		System.out.println();
		while (true) {
			System.out.println(gradesAppMenu);
			int userChoice = getInt(0, 6);
			clearConsole();
			if (userChoice == 0) {
				System.out.println("Goodbye, and have a wonderful day!");
				break;
			}
			switch (userChoice) {
				case 1 -> {
					printAllGrades();
				}
				case 2 -> {
					printStudent();
				}
				case 3 -> {
					printClassAverage();
				}
				case 4 -> {
					printUsernames();
				}
				case 5 -> {
					printCSV();
				}
				case 6 -> {
					printAttendance();
				}
			}
		}
	}

	// Prompts user for a username to view student information
	public static void printStudent() {
		System.out.println("What student would you like to see more information on?");
		String input = getString();
		if (students.containsKey(input)) {
			System.out.printf("Name: %s - Github Username: %s%nCurrent Grade Average: %f%nAll Grades: %s%nAttendance Record: %s%n", students.get(input).getName(),
					input, students.get(input).getGradeAverage(), students.get(input).getGrades(), students.get(input).getAttendancePercentage());
			System.out.println();
		} else {
			System.out.printf("Sorry, no student found with the GitHub username of \"%s\".%n", input);
		}
		if (yesNo("Would you like to see another student? [y/n]")) {
			printStudent();
		} else {
			System.out.println("Returning to main menu");
			clearConsole();
		}
	}

	// Prints all grades of all students
	public static void printAllGrades() {
		System.out.println("Displaying grades for every student.");
		System.out.println();
		Set allKeys = students.keySet();
		for (Object key : allKeys) {
			System.out.printf("%s's grades: %s%n", key, students.get(key).getGrades());
		}
		System.out.println();
		waitForUser();
		clearConsole();
	}

	// Prints the overall class average
	public static void printClassAverage() {
		double sum = 0;
		for (String key : students.keySet()) {
			sum += students.get(key).getGradeAverage();
		}
		System.out.printf("The class average is: %f%n", sum / students.size());
		waitForUser();
		clearConsole();
	}

	//Prints all usernames
	public static void printUsernames() {
		System.out.println("Here are the GitHub usernames of our students:");
		printSeparator(50);
		System.out.println();
		printSeparatorAlt(50);
		System.out.print("|");
		for (String key : students.keySet()) {
			System.out.printf(" %s |", key);
		}
		System.out.println();
		printSeparatorAlt(50);
		System.out.println();
		waitForUser();
		clearConsole();
	}
	//Prints a report in csv format with the students name, ghusername, and average grade
	public static void printCSV() {
		Set allKeys = students.keySet();
		System.out.println("name,github_username,average");
		for (Object key : allKeys) {
			System.out.printf("%s,%s,%f%n", students.get(key).getName(), key, students.get(key).getGradeAverage());
		}
		System.out.println();
		waitForUser();
		clearConsole();
	}
	//Prints a specific students attendance record
	public static void printAttendance() {
		System.out.println("What student would you like to see more information on?");
		String input = getString();
		if (students.containsKey(input)) {
			System.out.println(students.get(input).getAbsences());
			System.out.println();
		} else {
			System.out.printf("Sorry, no student found with the GitHub username of \"%s\".%n", input);
		}
		if (yesNo("Would you like to see another student? [y/n]")) {
			printAttendance();
		} else {
			System.out.println("Returning to main menu");
			clearConsole();
		}
	}
}
