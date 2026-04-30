package com.demo.day5;

public class BankCustomer {
	
	private int customerId;
	private String customerName;
	
	public BankCustomer() {
		// TODO Auto-generated constructor stub
	}

	public BankCustomer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "BankCustomer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}
	
	

}
