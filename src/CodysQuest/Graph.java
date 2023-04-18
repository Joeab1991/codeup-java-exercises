package CodysQuest;

import java.util.*;

public class Graph {
	private Map<Location, List<Location>> adjacencyList;

	public Graph() {
		adjacencyList = new HashMap<>();
	}

	public void addLocation(Location location) {
		adjacencyList.put(location, new LinkedList<Location>());
	}

	public void addConnection(Location source, Location destination) {
		if (!adjacencyList.containsKey(source))
			addLocation(source);
		if (!adjacencyList.containsKey(destination))
			addLocation(destination);
		adjacencyList.get(source).add(destination);
	}

	public List<Location> getNeighbors(Location location) {
		return adjacencyList.get(location);
	}

	public void printGraph() {
		for (Map.Entry<Location, List<Location>> entry : adjacencyList.entrySet()) {
			System.out.print(entry.getKey().getLocationName() + " is connected to: ");
			for (Location location : entry.getValue()) {
				System.out.print(location.getLocationName() + ", ");
			}
			System.out.println();
		}
	}
}


