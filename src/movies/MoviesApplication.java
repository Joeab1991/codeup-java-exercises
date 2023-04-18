package movies;
import CodysQuest.GameLogic;
import OOPExercises.Person;
import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
	private static Movie[] userAddedMovies;

	public static Movie[] addMovie (Movie[] moviesArray, Movie movie) {
		Movie[] newMoviesArray = Arrays.copyOf(moviesArray, moviesArray.length + 1);
		newMoviesArray[newMoviesArray.length - 1] = movie;
		return newMoviesArray;
	}

	public static String movieMenu = """
			What would you like to do?
			
			0 - exit
			1 - view all movies
			2 - view movies in the animated category
			3 - view movies in the drama category
			4 - view movies in the horror category
			5 - view movies in the scifi category
			6 - Add a movie
			Enter your choice:
			""";

	public static void showAllMoviesFromCategory(Movie[] movies, String category) {
		for (Movie movie : movies) {
			if (movie.getMovieCategory().equals(category)) {
				System.out.println(movie.getMovieName() + " -- " + movie.getMovieCategory());
			}
		}
		GameLogic.waitForUser();
	}

	public static void showAllMovies(Movie[] movies) {
		for (Movie movie : movies) {
			System.out.println(movie.getMovieName() + " -- " + movie.getMovieCategory());
		}
		GameLogic.waitForUser();
	}
	public static void main(String[] args) {
		//TODO Add functionality to allow a user to add a new movie to the list.
		Movie[] movies = MoviesArray.findAll();
		while (true) {
			GameLogic.clearConsole();
			System.out.printf(movieMenu);
			int userChoice = Input.getInt(0, 6);

			if (userChoice == 0) {
				System.out.println("Goodbye!");
				break;
			}
			switch (userChoice) {
				case 1 -> {
					showAllMovies(movies);
				}
				case 2 -> {
					showAllMoviesFromCategory(movies, "animated");
				}
				case 3 -> {
					showAllMoviesFromCategory(movies, "drama");
				}
				case 4 -> {
					showAllMoviesFromCategory(movies, "horror");
				}
				case 5 -> {
					showAllMoviesFromCategory(movies, "scifi");
				}
				case 6 -> {
					String movieName = Input.getString("Enter the name of the movie: ");
					String movieCategory = Input.getString("Enter the category of the movie: ");
					movies = addMovie(MoviesArray.findAll(), new Movie(movieName, movieCategory));
					System.out.println("Movie added!");
					GameLogic.waitForUser();
				}
			}
		}
	}

}
