package dao;

import entity.Movie;
import entity.Screen;
import entity.Theater;

public interface TheaterDao {

	public Theater addTheater(Theater theater);
	public Boolean deleteTheater(Integer theaterId);
	public Movie searchMovie(String movieName);
	public Screen searchScreen(Integer screenId);
}
