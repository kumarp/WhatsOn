package org.example.app.dao.api;

import java.util.List;

import org.example.app.domain.Movie;

public interface MovieDao {

	public List<Movie> findMoviesByTitle(String title);

}
