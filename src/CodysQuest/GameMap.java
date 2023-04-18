package CodysQuest;

import java.util.*;


public class GameMap {
	//create graph
	Graph gameMap = new Graph();

	//create locations variables to be used in the graph
	Location pedernlesClassroom;
	Location hallway;
	Location enchantedRockSharkTank;
	Location zenithLounge;
	Location bigBendClassroom;
	Location bathroom;
	Location mustangIslandRoom;
	Location blancoClassroom;
	Location elevator;
	Location abandonedLounge;
	Location secondFloorHallway;
	Location senatorJohnCornynsOffice;

	public GameMap() {
		//create locations
		pedernlesClassroom = new Location("Pedernales Classroom", "You are in the Pedernales Classroom. There is a desk in the front of the room with a computer on it. There is a door to the north.");
		hallway = new Location("Hallway", "You are in the hallway. There is a door to the south and a door to the north.");
		enchantedRockSharkTank = new Location("Enchanted Rock Shark Tank", "You are in the Enchanted Rock Shark Tank. There is a door to the south.");
		zenithLounge = new Location("Zenith Lounge", "You are in the Zenith Lounge. There is a door to the south.");
		bigBendClassroom = new Location("Big Bend Classroom", "You are in the Big Bend Classroom. There is a door to the south.");
		bathroom = new Location("Bathroom", "You are in the bathroom. There is a door to the south.");
		mustangIslandRoom = new Location("Mustang Island Room", "You are in the Mustang Island Room. There is a door to the south.");
		blancoClassroom = new Location("Blanco Classroom", "You are in the Blanco Classroom. There is a door to the south.");
		elevator = new Location("Elevator", "You are in the elevator. There is a door to the south.");
		abandonedLounge = new Location("Abandoned Lounge", "You are in the Abandoned Lounge. There is a door to the south.");
		secondFloorHallway = new Location("2nd Floor Hallway", "You are in the 2nd Floor Hallway. There is a door to the south and a door to the north.");
		senatorJohnCornynsOffice = new Location("Senator John Cornyn's Office", "You are in Senator John Cornyn's Office. There is a door to the south.");

		//add locations to the graph
		gameMap.addLocation(pedernlesClassroom);
		gameMap.addLocation(hallway);
		gameMap.addLocation(enchantedRockSharkTank);
		gameMap.addLocation(zenithLounge);
		gameMap.addLocation(bigBendClassroom);
		gameMap.addLocation(bathroom);
		gameMap.addLocation(mustangIslandRoom);
		gameMap.addLocation(blancoClassroom);
		gameMap.addLocation(elevator);
		gameMap.addLocation(abandonedLounge);
		gameMap.addLocation(secondFloorHallway);
		gameMap.addLocation(senatorJohnCornynsOffice);

		//add connections to the graph
		gameMap.addConnection(pedernlesClassroom, hallway);
		gameMap.addConnection(hallway, pedernlesClassroom);
		gameMap.addConnection(hallway, enchantedRockSharkTank);
		gameMap.addConnection(hallway, zenithLounge);
		gameMap.addConnection(hallway, bigBendClassroom);
		gameMap.addConnection(hallway, bathroom);
		gameMap.addConnection(hallway, mustangIslandRoom);
		gameMap.addConnection(hallway, blancoClassroom);
		gameMap.addConnection(hallway, elevator);
		gameMap.addConnection(hallway, abandonedLounge);
		gameMap.addConnection(elevator, secondFloorHallway);
		gameMap.addConnection(secondFloorHallway, senatorJohnCornynsOffice);
		gameMap.addConnection(secondFloorHallway, elevator);
		gameMap.addConnection(senatorJohnCornynsOffice, secondFloorHallway);
		gameMap.addConnection(abandonedLounge, hallway);
		gameMap.addConnection(elevator, hallway);
		gameMap.addConnection(blancoClassroom, hallway);
		gameMap.addConnection(mustangIslandRoom, hallway);
		gameMap.addConnection(bathroom, hallway);
		gameMap.addConnection(bigBendClassroom, hallway);
		gameMap.addConnection(zenithLounge, hallway);
		gameMap.addConnection(enchantedRockSharkTank, hallway);
	}
	public void printMap() {
		Set<Location> visited = new HashSet<>();
		Queue<Location> queue = new LinkedList<>();
		queue.offer(pedernlesClassroom);
		visited.add(pedernlesClassroom);

		while (!queue.isEmpty()) {
			Location current = queue.poll();
			System.out.println(current.getLocationName() + ": " + current.getLocationDescription());
			System.out.println("Neighbors: " + gameMap.getNeighbors(current));
			for (Location neighbor : gameMap.getNeighbors(current)) {
				if (!visited.contains(neighbor)) {
					visited.add(neighbor);
					queue.offer(neighbor);
				}
			}
		}
	}
}
//	public static String[] mapLocations = {"Pedernales Classroom", "Hallway", "Enchanted Rock Shark Tank",
//			"Zenith Lounge", "Big Bend Classroom", "Bathroom", "Mustang Island Room", "Blanco Classroom", "Elevator",
//			"Abandoned Lounge", "2nd Floor Hallway", "Senator John Cornyn's Office"};

	// Navigation methods
//	public static void moveFromHallway() {
//		if (player.getCurrentLocation().equals(mapLocations[1])) {
//			System.out.println("Can't get there from here.");
//			waitForUser();
//		}
//	}
//	public static void moveToHallway() {
//		if (player.getCurrentLocation().equals(mapLocations[11]) || player.getCurrentLocation().equals(mapLocations[12])) {
//			System.out.println("Can't get there from here.");
//			waitForUser();
//		}
//		player.setCurrentLocation(mapLocations[1]);
//	}
