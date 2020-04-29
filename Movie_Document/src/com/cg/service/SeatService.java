package com.cg.service;

import com.cg.dto.Seat;

public interface SeatService {

	enum  SeatStatus {Available,Blocked,Booked };
	public SeatStatus blockSeat();
	public Seat bookSeat();
	public Seat cancelSeatBooking();
}
