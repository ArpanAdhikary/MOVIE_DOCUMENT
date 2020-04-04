package dao;

import entity.Movie;

public interface MovieDao {

	public boolean addMovieDao(Movie movie);
	
	public boolean deleteMovie(Integer movieId);
}
