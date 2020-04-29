package com.cg.dto;


	import java.time.LocalDate;
	import java.util.ArrayList;

	public class Customer {
		private Integer userId;
		private String customerName, password, customerContact;
		private LocalDate dateOfBirth;
		private ArrayList<Ticket> myTicket = new ArrayList<Ticket>();
		
		public Customer(Integer userId, String customerName, String password, String customerContact, LocalDate dateOfBirth,
				ArrayList<Ticket> myTicket) {
			super();
			this.userId = userId;
			this.customerName = customerName;
			this.password = password;
			this.customerContact = customerContact;
			this.dateOfBirth = dateOfBirth;
			this.myTicket = myTicket;
		}


		public Customer() {
		}
		
		
		public Integer getUserId() {
			return userId;
		}
		public void setUserId(Integer userId) {
			this.userId = userId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getCustomerContact() {
			return customerContact;
		}
		public void setCustomerContact(String customerContact) {
			this.customerContact = customerContact;
		}
		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public ArrayList<Ticket> getMyTicket() {
			return myTicket;
		}
		public void setMyTicket(ArrayList<Ticket> myTicket) {
			this.myTicket = myTicket;
		}


		@Override
		public String toString() {
			return "Customer [userId=" + userId + ", customerName=" + customerName + ", password=" + password
					+ ", customerContact=" + customerContact + ", dateOfBirth=" + dateOfBirth + "]";
		}		
}

