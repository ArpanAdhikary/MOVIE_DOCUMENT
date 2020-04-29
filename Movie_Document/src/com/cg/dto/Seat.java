package com.cg.dto;

import com.cg.service.SeatService.SeatStatus;

public class Seat {

	
	private Integer seatId;
	public enum  SeatStatus {Available,Blocked,Booked};
	SeatStatus seatStatus;
	private Double seatPrice;
	

	public Seat() {
	}
	
	
	public Seat(Integer seatId, SeatStatus seatStatus, Double seatPrice) {
		super();
		this.seatId = seatId;
		this.seatStatus = seatStatus;
		this.seatPrice = seatPrice;
	
		// TODO Auto-generated constructor stub
	}

	public Integer getSeatId() {
		return seatId;
	}
	public void setSeatId(Integer seatId) {
		this.seatId = seatId;
	}
	public Double getSeatPrice() {
		return seatPrice;
	}
	public void setSeatPrice(Double seatPrice) {
		this.seatPrice = seatPrice;
	}
	public SeatStatus getSeatStatus() {
		return seatStatus;
	}
	public void setSeatStatus(SeatStatus seatStatus) {
		this.seatStatus = seatStatus;
	}

	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", seatPrice=" + seatPrice + ", seatStatus=" + seatStatus + "]";
	}
	
		
	
}
