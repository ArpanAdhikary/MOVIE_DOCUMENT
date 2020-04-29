package com.cg.dto;

import java.util.Arrays;

public class Ticket {

	private Integer ticketId;
	private Integer noOfSeats;
	private String seatName[];
	private Booking bookingRef;
	private Boolean ticketStatus;
	private String screenName;
	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
	public Integer getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public String[] getSeatName() {
		return seatName;
	}
	public void setSeatName(String[] seatName) {
		this.seatName = seatName;
	}
	public Booking getBookingRef() {
		return bookingRef;
	}
	public void setBookingRef(Booking bookingRef) {
		this.bookingRef = bookingRef;
	}
	public Boolean getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(Boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", noOfSeats=" + noOfSeats + ", seatName=" + Arrays.toString(seatName)
				+ ", ticketStatus=" + ticketStatus + ", screenName=" + screenName + "]";
	}
	
}
