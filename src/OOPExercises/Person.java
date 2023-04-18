package OOPExercises;

import RandomName.RandomName;

public class Person {
	private String name;

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}
	public void sayHello(){
		System.out.println("Hello, " + name + "!");
	}

	public Person(String name){
		this.name = name;
	}

	public static void main(String[] args){
		Person person0 = new Person(RandomName.getRandomName());
		person0.sayHello();

		Person person1 = new Person("John");
		Person person2 = person1;
		System.out.println(person1.getName());
		System.out.println(person2.getName());
		person2.setName("Jane");
		System.out.println(person1.getName());
		System.out.println(person2.getName());



	}
//The class should have a constructor that accepts a `String` value and sets
//the person's name to the passed string.
//
//Create a `main` method on the class that creates a new `Person` object and
//tests the above methods.
}
