package entity;

import java.time.LocalDate;

public class Screen {

	private Integer screenId;
	private Integer theatreId;
	private String screenName;
	private Show showList[];
	private LocalDate movieEndDate;
	private Integer rows,columns;
	
	
	public Screen(Integer screenId, Integer theatreId, String screenName, Show[] showList, LocalDate movieEndDate,
			Integer rows, Integer columns) {
		super();
		this.screenId = screenId;
		this.theatreId = theatreId;
		this.screenName = screenName;
		this.showList = showList;
		this.movieEndDate = movieEndDate;
		this.rows = rows;
		this.columns = columns;
	}
	
	public Integer getScreenId() {
		return screenId;
	}
	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}
	public Integer getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(Integer theatreId) {
		this.theatreId = theatreId;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public Show[] getShowList() {
		return showList;
	}
	public void setShowList(Show[] showList) {
		this.showList = showList;
	}
	public LocalDate getMovieEndDate() {
		return movieEndDate;
	}
	public void setMovieEndDate(LocalDate movieEndDate) {
		this.movieEndDate = movieEndDate;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public Integer getColumns() {
		return columns;
	}
	public void setColumns(Integer columns) {
		this.columns = columns;
	}
	
	@Override
	public String toString() {
		return "Screen [screenId=" + screenId + ", theatreId=" + theatreId + ", screenName=" + screenName
				+ ", movieEndDate=" + movieEndDate + ", rows=" + rows + ", Columns=" + columns + "]";
	}
	
}
