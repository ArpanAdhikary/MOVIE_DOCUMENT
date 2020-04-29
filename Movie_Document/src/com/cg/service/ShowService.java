package com.cg.service;

import com.cg.dto.Seat;
import com.cg.dto.Show;

public interface ShowService {

	public Boolean UpdateSeatsStatus(String anyThing[]);
	public Seat[] chooseSeat(String anyThing[]);
	public Boolean initiateBooking(Seat seat[],Show show);
}
