package entity;

import java.util.Arrays;

public class Theater {

	private Integer theaterId;
	private String theaterName;
	private String theaterCity;
	private Movie movies[];
	private Screen listOfScreens[];
	private String managerName;
	private String managerContact;
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
	public Movie[] getMovies() {
		return movies;
	}
	public void setMovies(Movie[] movies) {
		this.movies = movies;
	}
	public Screen[] getListOfScreens() {
		return listOfScreens;
	}
	public void setListOfScreens(Screen[] listOfScreens) {
		this.listOfScreens = listOfScreens;
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
				+ ", movies=" + Arrays.toString(movies) + ", listOfScreens=" + Arrays.toString(listOfScreens)
				+ ", managerName=" + managerName + ", managerContact=" + managerContact + "]";
	}
	
	
}
