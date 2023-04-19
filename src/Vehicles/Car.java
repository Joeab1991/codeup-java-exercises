package Vehicles;

public class Car extends Vehicle {
	@Override
	public void makeNoise() {
		System.out.println("Broom!");
	}

	public void breakDown() {
		super.makeNoise();
		System.out.println("Clang! Crash!");
	}
}

