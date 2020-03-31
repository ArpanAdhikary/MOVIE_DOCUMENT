package service;

import dao.MovieDao;
import entity.Movie;

public class MovieService {
	
	private MovieDao dao=new MovieDao();
	boolean result;
	public MovieService() {
		super();
	}

	public boolean addMovie(Movie movie){
				
		result=dao.addMovieDao(movie);
		return result;
		
	}
	
	public boolean deleteMovie(Integer movieId) {
		result=dao.deleteMovie(movieId);
		return result;
	}

}
