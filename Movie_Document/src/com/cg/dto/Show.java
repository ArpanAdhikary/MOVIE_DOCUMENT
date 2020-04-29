package com.cg.dto;

import java.time.LocalTime;
import java.util.Arrays;

public class Show {

	private Integer showId,screenId,theaterId;
	private String showName,movieName;
	private LocalTime showStartTime,showEndTime;
	private Integer seatId[];
	
	
	
	public Show(Integer showId, Integer screenId, Integer theaterId, String showName, String movieName,
			LocalTime showStartTime, LocalTime showEndTime, Integer[] seatId) {
		super();
		this.showId = showId;
		this.screenId = screenId;
		this.theaterId = theaterId;
		this.showName = showName;
		this.movieName = movieName;
		this.showStartTime = showStartTime;
		this.showEndTime = showEndTime;
		this.seatId = seatId;
	}
	
	public Integer getShowId() {
		return showId;
	}
	public void setShowId(Integer showId) {
		this.showId = showId;
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
	public void setTheaterId(Integer theaterId) {
		this.theaterId = theaterId;
	}
	public LocalTime getShowStartTime() {
		return showStartTime;
	}
	public void setShowStartTime(LocalTime showStartTime) {
		this.showStartTime = showStartTime;
	}
	public LocalTime getShowEndTime() {
		return showEndTime;
	}
	public void setShowEndTime(LocalTime showEndTime) {
		this.showEndTime = showEndTime;
	}
	
	public Integer[] getSeatId() {
		return seatId;
	}

	public void setSeatId(Integer[] seatId) {
		this.seatId = seatId;
	}

	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	@Override
	public String toString() {
		return "Show [showId=" + showId + ", screenId=" + screenId + ", theaterId=" + theaterId + ", showName="
				+ showName + ", movieName=" + movieName + ", showStartTime=" + showStartTime + ", showEndTime="
				+ showEndTime + ", seatId=" + Arrays.toString(seatId) + "]";
	}		
}
	
	

