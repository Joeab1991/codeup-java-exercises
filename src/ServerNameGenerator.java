import static util.Input.yesNo;

public class ServerNameGenerator {
	//TODO Create two arrays whose elements are strings: one with at least 10 adjectives,
	// another with at least 10 nouns.
	//TODO Create a method that will return a random element from an array of strings.
	//TODO Add a main method, and inside of your main method select and random noun and
	// adjective and hyphenate the combination and display the generated name to the user.
	//Example Output
	//
	//
	//Here is your server name:
	//dedicated-photon
	String[] adjectives = {"happy", "sad", "angry", "excited", "bored", "tired", "hungry", "thirsty", "sick", "healthy",
							"tall", "short", "fat", "skinny", "strong", "weak", "smart", "dumb", "rich", "poor",
							"fast", "slow", "young", "old", "new", "good", "bad", "nice", "mean"};
	String[] nouns = {"dog", "cat", "bird", "fish", "mouse", "rat", "snake", "lizard", "frog", "toad", "bear", "lion",
						"tiger", "elephant", "giraffe", "monkey", "ape", "human", "robot", "car", "truck", "plane",
						"boat", "ship", "train", "subway", "bus", "bicycle", "motorcycle", "scooter", "skateboard",
						"rollerblades", "roller skates", "shoes", "socks", "pants", "shirt", "hat", "glasses", "watch",
						"phone", "computer", "laptop", "tablet", "television", "radio", "book", "magazine", "newspaper",
						"cup", "bowl", "plate", "fork", "spoon", "knife", "chair", "table", "bed", "sofa", "couch",
						"lamp", "light", "fan", "air conditioner", "heater", "window", "door", "wall", "floor",
						"ceiling", "roof", "garden", "yard", "park", "forest", "mountain", "ocean", "lake", "river",
						"pond", "pool", "beach", "sand", "sun", "moon", "star", "planet", "galaxy", "universe", "earth",
						"mars", "jupiter", "saturn", "uranus", "neptune", "pluto", "mercury", "venus"};
	public static String getRandomElement(String[] array){
		int randomIndex = (int) (Math.random() * array.length);
		return array[randomIndex];
	}

	public static void generateServerName(){
		ServerNameGenerator serverNameGenerator = new ServerNameGenerator();
		System.out.println("Here is your server name:");
		System.out.println(getRandomElement(serverNameGenerator.adjectives) + "-" + getRandomElement(serverNameGenerator.nouns));
		if (yesNo("Would you like another server name?")) {
			generateServerName();
		} else {
			System.out.println("Goodbye!");
		}
	}
	public static void main(String[] args) {
		generateServerName();
	}
}
