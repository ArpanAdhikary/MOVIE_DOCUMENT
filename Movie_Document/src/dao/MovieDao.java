package dao;

import java.util.ArrayList;
import java.util.HashMap;

import entity.Movie;

public class MovieDao {
	private HashMap <Integer,ArrayList<Object>> movieList=new HashMap<>();
	private ArrayList<Object> arr = new ArrayList<>();
	
	public MovieDao() {
		super();
	}
	public boolean addMovieDao(Movie movie) {
		arr.add(movie.getMovieName());
		arr.add(movie.getMovieGenre());
		arr.add(movie.getMovieDirector());
		arr.add(movie.getMovieLength());
		arr.add(movie.getLanguage());
		arr.add(movie.getDate());
		movieList.put(movie.getMovieId(), arr);
		return true;	
    }
	public boolean deleteMovie(Integer movieId) {
		movieList.remove(movieId);
		return true;
	}
	public void updateMovie() {
		
	}
//	public Movie viewMovie() {
//		return movie;
//	}
}
