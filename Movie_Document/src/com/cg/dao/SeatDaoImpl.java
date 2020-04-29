package com.cg.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.dto.Seat;

public class SeatDaoImpl implements SeatDao {

	private HashMap <Integer,ArrayList<Object>> seatList=new HashMap<>();
	
	@Override
	public Boolean addSeat(Seat seat) {
		ArrayList<Object> arr = new ArrayList<>();
		if((seatList.containsKey(seat.getSeatId()))==false) {
			arr.add(seat.getSeatStatus());
			arr.add(seat.getSeatPrice());
			seatList.put(seat.getSeatId(), arr);
			return true;
		}
		else
			return false;
	}

	@Override
	public Boolean deleteSeat(Integer seatId) {
		if(seatList.remove(seatId)==null)
			return false;
		else
			return true;
	}

	
}
