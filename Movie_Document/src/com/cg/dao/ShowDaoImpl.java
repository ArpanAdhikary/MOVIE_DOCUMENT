package com.cg.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.dto.Show;

public class ShowDaoImpl implements ShowDao{

	private HashMap <Integer,ArrayList<Object>> showList=new HashMap<>();
	
	
	@Override
	public Show addShowDao(Show show) {
		ArrayList<Object> arr = new ArrayList<>();
		if((showList.containsKey(show.getShowId()))==false) {
			arr.add(show.getTheaterId());
			arr.add(show.getScreenId());
			arr.add(show.getShowName());
			arr.add(show.getMovieName());
			arr.add(show.getShowStartTime());
			arr.add(show.getShowEndTime());
			arr.add(show.getSeatId());
			showList.put(show.getShowId(), arr);
			return show;
		}
		else
			return null;
	}

	@Override
	public boolean deleteShow(Integer showId) {
		if(showList.remove(showId)==null)
			return false;
		else
			return true;
	}
}
