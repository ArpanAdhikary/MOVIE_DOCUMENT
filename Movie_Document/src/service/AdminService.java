package service;

import entity.Movie;
import entity.Screen;
import entity.Show;
import entity.Theater;

public interface AdminService {

	public Theater addTheater(Theater theater);
	public Boolean deleteTheater(Integer theaterId);
	public Movie addMovie(Movie movie);
	public Boolean deleteMovie(Integer movieId);
	public Movie addScreen(Screen screen);
	public Boolean deleteScreen(Integer screenId);
	public Movie addShow(Show show);
	public Boolean deleteShow(Integer showId);
	
}
