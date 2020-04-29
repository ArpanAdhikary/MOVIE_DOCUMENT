package com.cg.exceptions;

public class AdminExceptions extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer adminId;
	public AdminExceptions(Integer adminId) {
		super();
		this.adminId = adminId;
	}
	
}
