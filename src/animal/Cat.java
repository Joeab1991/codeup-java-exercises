package animal;

public class Cat {
	private String name;
	private int age;
	private String breed;
	private String mood;

	public Cat() {
	}

	public Cat(String name, int age, String breed, String mood) {
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.mood = mood;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}

	public void meow() {
		System.out.println("\"" + Quote.getQuote() + "\"" + "\n");
	}
	public void printStats() {
		System.out.printf("The cat's stats are:%nName: %s | Age: %d | Breed: %s | Mood: %s%n%n", name, age, breed, mood);
	}
}
