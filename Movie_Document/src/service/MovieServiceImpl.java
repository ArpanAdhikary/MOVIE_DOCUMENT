package service;

import dao.MovieDaoImpl;
import entity.Movie;

public class MovieServiceImpl implements MovieService{
	
	private MovieDaoImpl dao=new MovieDaoImpl();
	boolean result;
	public MovieServiceImpl() {
		super();
	}
	
	@Override
	public boolean addMovie(Movie movie){
				
		result=dao.addMovieDao(movie);
		return result;
		
	}
	
	@Override
	public boolean deleteMovie(Integer movieId) {
		result=dao.deleteMovie(movieId);
		return result;
	}

}
