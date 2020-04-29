package com.cg.exceptions;

public class SeatExceptions extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer seatId;
	
	public SeatExceptions(Integer seatId) {
		super();
		this.seatId = seatId;
	}
	
	@Override
	public String toString() {
		String id=Integer.toString(seatId);
		if(seatId==0)
			return "Seat Id cannot be 0";
		else if(id.length()<6)
			return "Seat Id should contain more than 6 digits";
		else
			return "Some other error occur please check the format before inserting";
	}

	
}
