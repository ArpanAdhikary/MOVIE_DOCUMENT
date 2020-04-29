package com.cg.service;

import com.cg.dto.Movie;
import com.cg.dto.Screen;
import com.cg.dto.Seat;
import com.cg.dto.Show;
import com.cg.dto.Theater;

public interface AdminService {

	public Theater addTheater(Theater theater);
	public Boolean deleteTheater(Integer theaterId);
	public Movie addMovie(Movie movie);
	public Boolean deleteMovie(Integer movieId);
	public Screen addScreen(Screen screen);
	public Boolean deleteScreen(Integer screenId);
	public Show addShow(Show show);
	public Boolean deleteShow(Integer showId);
	public Boolean addSeat(Seat seat);
	public Boolean deleteSeat(Integer seatId);
}
