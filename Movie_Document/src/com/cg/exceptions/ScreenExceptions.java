package com.cg.exceptions;

public class ScreenExceptions extends Exception{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private Integer screenId;
		
		
		public ScreenExceptions(Integer screenId) {
			super();
			this.screenId = screenId;
		}
		public String toString() {
			String id=Integer.toString(screenId);
			if(screenId==0)
				return "Screen Id cannot be 0";
			else if(id.length()<4)
				return "Screen Id should contain more than 4 digits";
			else
				return "Some other error occur please check the format before inserting";
		}
		
	}


