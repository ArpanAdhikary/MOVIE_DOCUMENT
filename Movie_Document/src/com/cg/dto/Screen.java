package com.cg.dto;

import java.util.Arrays;

public class Screen {

	private Integer screenId;
	private Integer theaterId;
	private String screenName;
	private Integer showList[];
	private Integer rows,columns;
	
	
	public Screen(Integer screenId, Integer theatreId, String screenName, Integer[] showList, Integer rows,
			Integer columns) {
		super();
		this.screenId = screenId;
		this.theaterId = theatreId;
		this.screenName = screenName;
		this.showList = showList;
		this.rows = rows;
		this.columns = columns;
	}
	
	
	public Screen() {
		super();
	}


	public Integer getScreenId() {
		return screenId;
	}
	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}
	public Integer getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(Integer theatreId) {
		this.theaterId = theatreId;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public Integer[] getShowList() {
		return showList;
	}
	public void setShowList(Integer[] showList) {
		this.showList = showList;
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
		return "Screen [screenId=" + screenId + ", theatreId=" + theaterId + ", screenName=" + screenName
				+ ", showList=" + Arrays.toString(showList) + ", rows=" + rows + ", columns=" + columns + "]";
	}
	
	
	}
