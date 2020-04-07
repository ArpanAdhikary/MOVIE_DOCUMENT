package service;

import entity.Theater;
import entity.Ticket;

public interface CustomerService {
	public Boolean bookMovieTicket(Theater theaterId);
	public Boolean cancelMovieTicket(Ticket ticketId);
	public Boolean chooseCity(String city);

}
