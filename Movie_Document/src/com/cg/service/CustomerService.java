package com.cg.service;

import com.cg.dto.Theater;
import com.cg.dto.Ticket;

public interface CustomerService {
	public Boolean bookMovieTicket(Theater theaterId);
	public Boolean cancelMovieTicket(Ticket ticketId);
	public Boolean chooseCity(String city);

}
