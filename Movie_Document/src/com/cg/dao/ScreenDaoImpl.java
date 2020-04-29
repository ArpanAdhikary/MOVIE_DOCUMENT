package com.cg.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.log4j.Logger;

import com.cg.dto.Screen;
import com.cg.dto.Show;

public class ScreenDaoImpl implements ScreenDao{

	private HashMap <Integer,ArrayList<Object>> screenList=new HashMap<>();
	Logger logger = Logger.getLogger(MovieDaoImpl.class.getName());
	
	
	@Override
	public Screen addScreen(Screen screen) {
		if((screenList.containsKey(screen.getScreenId()))==false) {
			logger.info("Screen is checked and now getting added in database");
			ArrayList<Object> arr = new ArrayList<>();
			arr.add(screen.getTheaterId());
			arr.add(screen.getScreenName());
			arr.add(screen.getShowList());
			arr.add(screen.getRows());
			arr.add(screen.getColumns());
			screenList.put(screen.getScreenId(), arr);
			return screen;
		}
		else
			return null;
	}

	@Override
	public Boolean deleteScreen(Integer screenId) {
		if((screenList.containsKey(screenId))==true) {
			logger.info("Movie is checked and now getting removed from database");
			screenList.remove(screenId);	
			viewScreen();
			return true;
		}
		else
			return false;
	}
		public ArrayList<Object> viewScreen(Integer screenId)
		{
			ArrayList<Object> arrayScreen=screenList.get(screenId);
			arrayScreen.add(0, screenId);
			return arrayScreen;
		}
		public void viewScreen() {
			ArrayList<Object> arrayScreen=new ArrayList<Object>();
			for(Integer screen:screenList.keySet()) {
				arrayScreen=screenList.get(screen);
				System.out.println(arrayScreen);
			}
		}

	@Override
	public Show searchShow(String showName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Show[] showShows() {
		// TODO Auto-generated method stub
		return null;
	}

}
