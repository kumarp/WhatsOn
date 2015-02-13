package org.example.app.service;

import java.util.List;

import org.example.app.domain.Movie;

public class MovieSearchResponse {

	private List<Movie> returnedMovies;

	private String message;

	public MovieSearchResponse() {
		super();
	}

	public MovieSearchResponse(List<Movie> returnedMovies) {
		super();
		this.returnedMovies = returnedMovies;
	}

	public List<Movie> getReturnedMovies() {
		return returnedMovies;
	}

	public void setReturnedMovies(List<Movie> returnedMovies) {
		this.returnedMovies = returnedMovies;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result
				+ ((returnedMovies == null) ? 0 : returnedMovies.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieSearchResponse other = (MovieSearchResponse) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (returnedMovies == null) {
			if (other.returnedMovies != null)
				return false;
		} else if (!returnedMovies.equals(other.returnedMovies))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MovieSearchResponse [returnedMovies=" + returnedMovies
				+ ", message=" + message + "]";
	}

}
