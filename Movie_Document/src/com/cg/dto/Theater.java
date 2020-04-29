package com.cg.dto;

import java.util.Arrays;

public class Theater {

	private Integer theaterId;
	private String theaterName;
	private String theaterCity;
	private Integer movieList[];
	private Integer screenList[];
	private String managerName;
	private String managerContact;
	
	public Theater(Integer theaterId, String theaterName, String theaterCity, Integer[] movieList, Integer[] screenList,
			String managerName, String managerContact) {
		super();
		this.theaterId = theaterId;
		this.theaterName = theaterName;
		this.theaterCity = theaterCity;
		this.movieList = movieList;
		this.screenList = screenList;
		this.managerName = managerName;
		this.managerContact = managerContact;
	}

	public Integer getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(Integer theaterId) {
		this.theaterId = theaterId;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getTheaterCity() {
		return theaterCity;
	}

	public void setTheaterCity(String theaterCity) {
		this.theaterCity = theaterCity;
	}

	public Integer[] getMovieList() {
		return movieList;
	}

	public void setMovieList(Integer[] movieList) {
		this.movieList = movieList;
	}

	public Integer[] getScreenList() {
		return screenList;
	}

	public void setScreenList(Integer[] screenList) {
		this.screenList = screenList;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerContact() {
		return managerContact;
	}

	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}

	@Override
	public String toString() {
		return "Theater [theaterId=" + theaterId + ", theaterName=" + theaterName + ", theaterCity=" + theaterCity
				+ ", movieList=" + Arrays.toString(movieList) + ", screenList=" + Arrays.toString(screenList)
				+ ", managerName=" + managerName + ", managerContact=" + managerContact + "]";
	}
	
	
}
