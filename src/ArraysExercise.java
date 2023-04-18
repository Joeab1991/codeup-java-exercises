import java.util.Arrays;
import OOPExercises.Person;
import RandomName.RandomName;

public class ArraysExercise {
	public static void main(String[] args) {
		Person[] peeps = new Person[3];
		peeps[0] = new Person("John");
		peeps[1] = new Person("Jane");
		peeps[2] = new Person("Joe");
		for (Person person : peeps) {
			System.out.println(person.getName());
		}
		System.out.println("\n");

		System.out.println("Adding a new person...\n");

		Person[] newPeeps = addPerson(peeps, new Person("Cody"));

		for (Person person : newPeeps) {
			System.out.println(person.getName());
		}
	}


	public static Person[] addPerson (Person[] people, Person person) {
		Person[] newPeople = Arrays.copyOf(people, people.length + 1);
		newPeople[newPeople.length - 1] = person;
		return newPeople;
	}



}
