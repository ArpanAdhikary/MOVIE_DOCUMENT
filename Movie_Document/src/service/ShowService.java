package service;

import entity.Seat;
import entity.Show;

public interface ShowService {

	public Boolean UpdateSeatsStatus(String anyThing[]);
	public Seat[] chooseSeat(String anyThing[]);
	public Boolean initiateBooking(Seat seat[],Show show);
}
