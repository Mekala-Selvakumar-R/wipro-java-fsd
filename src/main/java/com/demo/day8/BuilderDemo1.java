package com.demo.day8;

import java.time.LocalDate;

public class BuilderDemo1 {

	public static void main(String[] args) {

		Customer customer = new Customer.Builder().setCustomerId(1011).setCustomerName("Rohit").build();
		System.out.println(customer);
	}

}

class Customer {
	private int customerId;
	private String customerName;
	private LocalDate dateOfBirth;
	private String emailId;
	private String contactNumber;

	private Customer() {
	}

	private Customer(Builder builder) {
		this.customerId = builder.customerId;
		this.customerName = builder.customerName;
		this.contactNumber = builder.contactNumber;
		this.emailId = builder.emailId;
		this.dateOfBirth = builder.dateOfBirth;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", dateOfBirth=" + dateOfBirth
				+ ", emailId=" + emailId + ", contactNumber=" + contactNumber + "]";
	}

	static class Builder {
		private int customerId;
		private String customerName;
		private LocalDate dateOfBirth;
		private String emailId;
		private String contactNumber;

		Builder setCustomerId(int customerId) {
			this.customerId = customerId;
			return this;

		}

		Builder setCustomerName(String customerName) {
			this.customerName = customerName;
			return this;
		}

		Builder setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
			return this;
		}

		Builder setEmailId(String emailId) {
			this.emailId = emailId;
			return this;
		}

		Builder setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
			return this;
		}

		public Customer build() {
			return new Customer(this);
		}

	}
	// end of static Builer class

}