package com.cg.dao;

import com.cg.dto.Screen;
import com.cg.dto.Show;

public interface ScreenDao {

	public Screen addScreen(Screen screen);
	public Boolean deleteScreen(Integer screenId);
	public Show searchShow(String showName);
	public Show[] showShows();
	
}
