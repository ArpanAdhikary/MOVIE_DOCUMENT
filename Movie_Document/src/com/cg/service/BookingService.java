package com.cg.service;

import com.cg.dto.Seat;

public interface BookingService {

	enum PaymentMethod {Card,UPI,Cash_on_Delivery };
	public Double calculateTotalCost();
	public Seat[] chooseSeats();
	public PaymentMethod choosePaymentMethod();
	public Boolean makePayement(PaymentMethod type,Double value);
	public Boolean cancelTickets(Seat seat[]);
}
