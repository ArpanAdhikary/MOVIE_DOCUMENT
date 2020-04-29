package com.cg.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.log4j.Logger;

import com.cg.dto.Movie;


public class MovieDaoImpl implements MovieDao{
	 HashMap <Integer,ArrayList<Object>> movieList=new HashMap<>();
	 Logger logger = Logger.getLogger(MovieDaoImpl.class.getName());
		
	
	public MovieDaoImpl() {
		super();
	}
	@Override
	public Movie addMovieDao(Movie movie) {
		ArrayList<Object> arr = new ArrayList<>();
		if((movieList.containsKey(movie.getMovieId()))==false) {
			logger.info("Movie is checked and now getting added in database");
			arr.add(movie.getMovieName());
			arr.add(movie.getMovieGenre());
			arr.add(movie.getMovieDirector());
			arr.add(movie.getMovieLength());
			arr.add(movie.getLanguage());
			arr.add(movie.getDate());
			movieList.put(movie.getMovieId(), arr);
			viewMovie();
			return movie;
		}
		else
			return null;
    }
	
	@Override
	public boolean deleteMovie(Integer movieId) {
		
		if((movieList.containsKey(movieId))==true) {
			logger.info("Movie is checked and now getting removed from database");
			movieList.remove(movieId);	
			viewMovie();
			return true;
		}
			
		else
			return false;
	}
//	public void updateMovie() {
//		
//	}
	public ArrayList<Object> viewMovie(Integer movieId)
	{
		ArrayList<Object> arrayMovie=movieList.get(movieId);
		arrayMovie.add(0, movieId);
		return arrayMovie;
	}
	public void viewMovie() {
		ArrayList<Object> arrayMovie=new ArrayList<Object>();
		for(Integer movie:movieList.keySet()) {
			arrayMovie=movieList.get(movie);
			System.out.println(arrayMovie);
		}
		
	}
}
