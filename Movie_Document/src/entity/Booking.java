package entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Booking {

	private Integer bookingId,movieId,showId,transactionId;
	private Show showRef;
	private LocalDate bookingDate;
	private Double totalCost;
	private Seat seatList[];
	private Ticket ticket;
	
	
	public Booking(Integer bookingId, Integer movieId, Integer showId, Integer transactionId, Show showRef,
			LocalDate bookingDate, Double totalCost, Seat[] seatList, Ticket ticket) {
		super();
		this.bookingId = bookingId;
		this.movieId = movieId;
		this.showId = showId;
		this.transactionId = transactionId;
		this.showRef = showRef;
		this.bookingDate = bookingDate;
		this.totalCost = totalCost;
		this.seatList = seatList;
		this.ticket = ticket;
	}
	
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public Integer getShowId() {
		return showId;
	}
	public void setShowId(Integer showId) {
		this.showId = showId;
	}
	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	public Show getShowRef() {
		return showRef;
	}
	public void setShowRef(Show showRef) {
		this.showRef = showRef;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}
	public Seat[] getSeatList() {
		return seatList;
	}
	public void setSeatList(Seat[] seatList) {
		this.seatList = seatList;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", movieId=" + movieId + ", showId=" + showId + ", transactionId="
				+ transactionId + ", bookingDate=" + bookingDate + ", totalCost=" + totalCost + ", seatList="
				+ Arrays.toString(seatList) + ", ticket=" + ticket + "]";
	}
	
	
}
