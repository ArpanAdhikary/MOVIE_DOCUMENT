package com.cg.dao;

import com.cg.dto.Movie;

public interface MovieDao {

	public Movie addMovieDao(Movie movie);
	
	public boolean deleteMovie(Integer movieId);
}
