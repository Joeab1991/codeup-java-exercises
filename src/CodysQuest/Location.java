package CodysQuest;

import java.util.ArrayList;
import java.util.List;

public class Location {
	private String name;
	private String description;
	private List<Location> adjacentLocations;

	public Location(String name, String description) {
		this.name = name;
		this.description = description;
		this.adjacentLocations = new ArrayList<>();
	}


		// getters and setters
	public void setAdjacentLocation(Location location) {
		this.adjacentLocations.add(location);
	}


	public String getLocationName() {
		return name;
	}

	public void setLocationName(String name) {
		this.name = name;
	}

	public String getLocationDescription() {
		return description;
	}

	public void setLocationDescription(String description) {
		this.description = description;
	}
}
