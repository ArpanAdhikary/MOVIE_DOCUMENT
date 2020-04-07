package dao;

import entity.Movie;

public interface MovieDao {

	public Movie addMovieDao(Movie movie);
	
	public boolean deleteMovie(Integer movieId);
}
