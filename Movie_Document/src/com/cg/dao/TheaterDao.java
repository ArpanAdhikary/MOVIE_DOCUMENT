package com.cg.dao;

import com.cg.dto.Movie;
import com.cg.dto.Screen;
import com.cg.dto.Theater;

public interface TheaterDao {

	public Theater addTheater(Theater theater);
	public Boolean deleteTheater(Integer theaterId);
	public Movie searchMovie(String movieName);
	public Screen searchScreen(Integer screenId);
}
