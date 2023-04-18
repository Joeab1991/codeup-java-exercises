package movies;

public class Movie {
	//Todo Create a class named Movie. It should have private fields for name and category, and a constructor that sets
	// both of these. Create methods to access these properties and change them (getters and setters).
	private String name;
	private String category;

	// Constructor
	public Movie(String name, String category) {
		this.name = name;
		this.category = category;
	}

	// Getters and Setters

	public String getMovieName() {
		return name;
	}

	public void setMovieName(String name) {
		this.name = name;
	}

	public String getMovieCategory() {
		return category;
	}

	public void setMovieCategory(String category) {
		this.category = category;
	}


}
