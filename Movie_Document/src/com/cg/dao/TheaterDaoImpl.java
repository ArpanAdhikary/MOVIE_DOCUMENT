package com.cg.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.dto.Movie;
import com.cg.dto.Screen;
import com.cg.dto.Theater;

public class TheaterDaoImpl implements TheaterDao{

	private HashMap <Integer,ArrayList<Object>> theaterList=new HashMap<>();
	
	@Override
	public Theater addTheater(Theater theater) {
		if((theaterList.containsKey(theater.getTheaterId()))==false) {			
			ArrayList<Object> arr = new ArrayList<>();
			arr.add(theater.getTheaterName());
			arr.add(theater.getTheaterCity());
			arr.add(theater.getMovieList());
			arr.add(theater.getScreenList());
			arr.add(theater.getManagerName());
			arr.add(theater.getManagerContact());
			theaterList.put(theater.getTheaterId(), arr);
			return theater;
		}
		else
			return null;
	}

	@Override
	public Boolean deleteTheater(Integer theaterId) {
		if(theaterList.remove(theaterId)==null)
			return false;
		else
			return true;
		}

	@Override
	public Movie searchMovie(String movieName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Screen searchScreen(Integer screenId) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
