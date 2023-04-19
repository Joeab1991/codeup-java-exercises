package Vehicles;

import java.util.ArrayList;

public class GarageTest {
	public static void main(String[] args) {
		Garage garage = new Garage();

		garage.vehicles = new Vehicle[3];
		Car car = new Car();
		car.setName("Cody's Car");
		garage.vehicles[0] = car;
		Car car2 = new Car();
		car2.setName("Joe's Car");
		garage.vehicles[1] = car2;
		Car car3 = new Car();
		car3.setName("Bob's Car");
		garage.vehicles[2] = car3;

		garage.alarmCascade();

		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(car);
		vehicles.add(car2);
		vehicles.add(car3);

		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle.getName());
			vehicle.makeNoise();
		}

		System.out.println(vehicles.size());
		System.out.println(vehicles.get(0).getName());



	}
}
