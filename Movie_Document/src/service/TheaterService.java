package service;

import entity.Movie;
import entity.Screen;

public interface TheaterService {

	public Movie searchMovie(String movieName);
	public Screen searchScreen(Integer screenId);
}
