package Vehicles;

public class Garage {

	protected Vehicle[] vehicles;

	public void alarmCascade() {
		for (Vehicle vehicle : vehicles) {
			vehicle.makeNoise();
		}
	}
}
