package com.cg.exceptions;

public class TheaterExceptions extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer theaterId;
	
	
	public TheaterExceptions(Integer theaterId) {
		super();
		this.theaterId = theaterId;
	}

	@Override
	public String toString() {
		String id=Integer.toString(theaterId);
		if(theaterId==0)
			return "Theater Id cannot be 0";
		else if(id.charAt(0)!='2')
			return "Theater Id should start with 2";
		else if(id.length()<4)
			return "Theater Id should contain more than 4 digits";
		else
			return "Some other error occur please check the format before inserting";
	}
	

}
