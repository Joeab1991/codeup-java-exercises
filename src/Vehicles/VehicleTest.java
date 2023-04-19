package Vehicles;

public class VehicleTest {
	public static void main(String[] args) {
		Car car = new Car();
		car.setName("Cody's Car");
		System.out.println(car.getName());
		car.makeNoise();
		car.breakDown();
	}
}

