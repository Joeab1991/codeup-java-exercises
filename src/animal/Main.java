package animal;

import RandomName.RandomName;

public class Main {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.setName("Sammy");
		cat1.setAge(5);
		cat1.setBreed("Tabby");
		cat1.setMood(Temperment.getTemperment());
		cat1.meow();
		System.out.println("A new cat appears!\n");
		cat1.printStats();

		Cat cat2 = new Cat("Sally", 3, "Siamese", Temperment.getTemperment());
		cat2.meow();
		System.out.println("A new cat appears!\n");
		cat2.printStats();

		Cat cat3 = new Cat(RandomName.getName(), 2, "Sphynx", Temperment.getTemperment());
		cat3.meow();
		System.out.println("A new cat appears!\n");
		cat3.printStats();

	}
}
