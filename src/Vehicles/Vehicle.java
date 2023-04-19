package Vehicles;

public class Vehicle {
	private String name;

	public void makeNoise() {
		System.out.println("Vroom!");
	}

	public Vehicle(String name) {
		this.name = name;
	}

	public Vehicle() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
