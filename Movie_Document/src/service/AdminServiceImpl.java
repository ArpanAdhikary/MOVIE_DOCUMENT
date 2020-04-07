package service;

import dao.MovieDaoImpl;
import entity.Movie;
import entity.Screen;
import entity.Show;
import entity.Theater;

public class AdminServiceImpl implements AdminService{

	private MovieDaoImpl dao=new MovieDaoImpl();
	boolean result;
	private Movie  movies;
	
	
	
	public AdminServiceImpl() {
		super();
	}

	@Override
	public Theater addTheater(Theater theater) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteTheater(Integer theaterId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie addMovie(Movie movie) {
		movies=dao.addMovieDao(movie);
		return movies;
		
	}

	@Override
	public Boolean deleteMovie(Integer movieId) {
		result=dao.deleteMovie(movieId);
		return result;
		}

	@Override
	public Movie addScreen(Screen screen) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteScreen(Integer screenId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie addShow(Show show) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteShow(Integer showId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
