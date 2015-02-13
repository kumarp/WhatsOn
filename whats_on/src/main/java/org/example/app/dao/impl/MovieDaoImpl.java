package org.example.app.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.example.app.dao.api.MovieDao;
import org.example.app.domain.Movie;
import org.example.app.service.MovieSearchResponse;

public class MovieDaoImpl implements MovieDao {

	// First iteration mock data store
	private Movie movie1 = new Movie(1L,
			"The Lord of the Rings: The Fellowship of the Ring",
			"Netflix, Hulu");
	private Movie movie2 = new Movie(2L,
			"The Lord of the Rings: The Two Towers", "Hulu");
	private Movie movie3 = new Movie(3L,
			"The Lord of the Rings: The Return of the King", "Netflix, Hulu");
	private Movie movie4 = new Movie(4L, "Babe: Pig in the City", "Hulu");
	private Movie movie5 = new Movie(5L, "Riverdance: Lord of the Dance",
			"Netflix");
	private Movie movie6 = new Movie(6L,
			"The Lord of the Blings: The Return of the Bling", "Netflix");

	public List<Movie> findMoviesByTitle(String title) {
		// Initialize datastore
		List<Movie> movies = new ArrayList<Movie>();
		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);
		movies.add(movie4);
		movies.add(movie5);
		movies.add(movie6);

		MovieSearchResponse response = new MovieSearchResponse(
				new ArrayList<Movie>());

		for (Movie movie : movies) {
			if (movie.getTitle().contains(title)) {
				response.getReturnedMovies().add(movie);
			}
		}

		return movies;
	}

}
