package service;

import entity.Movie;

public interface MovieService {

	public boolean addMovie(Movie movie);
	public boolean deleteMovie(Integer movieId);
}
