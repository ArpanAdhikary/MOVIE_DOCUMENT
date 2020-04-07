package dao;

import java.util.ArrayList;
import java.util.HashMap;

import entity.Movie;

public class MovieDaoImpl implements MovieDao{
	private HashMap <Integer,ArrayList<Object>> movieList=new HashMap<>();
	private ArrayList<Object> arr = new ArrayList<>();
	
	public MovieDaoImpl() {
		super();
	}
	@Override
	public Movie addMovieDao(Movie movie) {
		arr.add(movie.getMovieName());
		arr.add(movie.getMovieGenre());
		arr.add(movie.getMovieDirector());
		arr.add(movie.getMovieLength());
		arr.add(movie.getLanguage());
		arr.add(movie.getDate());
		movieList.put(movie.getMovieId(), arr);
		return movie;	
    }
	@Override
	public boolean deleteMovie(Integer movieId) {
		movieList.remove(movieId);
		return true;
	}
//	public void updateMovie() {
//		
//	}
//	public Movie viewMovie() {
//		return movie;
//	}
}
