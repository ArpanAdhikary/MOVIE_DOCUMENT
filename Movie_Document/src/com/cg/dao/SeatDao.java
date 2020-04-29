package com.cg.dao;

import com.cg.dto.Seat;

public interface SeatDao {

	public Boolean addSeat(Seat seat) ;
	public Boolean deleteSeat(Integer seatId);
	
}
