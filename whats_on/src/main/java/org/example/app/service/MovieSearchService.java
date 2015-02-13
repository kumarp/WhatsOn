package org.example.app.service;

import java.util.ArrayList;
import java.util.List;

import org.example.app.dao.api.MovieDao;
import org.example.app.dao.impl.MovieDaoImpl;
import org.example.app.domain.Movie;

public class MovieSearchService {

	private static final String NO_RESULTS_FOUND_MSG = "No Results Found";

	private MovieDao movieDao = new MovieDaoImpl();

	public MovieSearchResponse findByTitle(String title) {
		MovieSearchResponse response = new MovieSearchResponse(
				new ArrayList<Movie>());

		List<Movie> results = movieDao.findMoviesByTitle(title);
		response.setReturnedMovies(results);

		// If no results found, set appropriate respose message
		if (results.isEmpty()) {
			response.setMessage(NO_RESULTS_FOUND_MSG);
		}

		return response;
	}
}
