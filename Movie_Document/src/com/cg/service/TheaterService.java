package com.cg.service;

import com.cg.dto.Movie;
import com.cg.dto.Screen;

public interface TheaterService {

	public Movie searchMovie(String movieName);
	public Screen searchScreen(Integer screenId);
}
