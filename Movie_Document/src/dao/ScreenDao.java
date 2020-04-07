package dao;

import entity.Screen;
import entity.Show;

public interface ScreenDao {

	public Screen addScreen(Screen screen);
	public Boolean deleteScreen(Integer screenId);
	public Show searchShow(String showName);
	public Show[] showShows();
	
}
