package service;

import entity.Seat;

public interface SeatService {

	enum  seatStatus {Available,Blocked,Booked };
	public seatStatus blockSeat();
	public Seat bookSeat();
	public Seat cancelSeatBooking();
}
