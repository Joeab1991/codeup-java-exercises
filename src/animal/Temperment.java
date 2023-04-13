package animal;

public class Temperment {
	public static String getTemperment() {
		String[] temperaments = {"Aggressive", "Calm", "Playful", "Shy", "Sociable", "Timid", "Wild"};
		int randomIndex = (int) (Math.random() * temperaments.length);
		return temperaments[randomIndex];
	}
}
