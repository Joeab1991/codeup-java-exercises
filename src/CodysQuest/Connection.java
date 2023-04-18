package CodysQuest;

public class Connection {
	private Location source;
	private Location destination;

	public Connection(Location source, Location destination) {
		this.source = source;
		this.destination = destination;
	}

	public Location getSource() {
		return source;
	}

	public void setSource(Location source) {
		this.source = source;
	}

	public Location getDestination() {
		return destination;
	}

	public void setDestination(Location destination) {
		this.destination = destination;
	}
}
