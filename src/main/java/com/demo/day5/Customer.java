package com.demo.day5;

public class Customer {
	private int customerId;
	private String customerName;
	private int age;

	private Customer() {
		// TODO Auto-generated constructor stub
	}

	private Customer(int customerId, String customerName, int age) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("%-10s%-20s%-10s", customerId, customerName, age);
	}

	// customerId-customerName-age
	// 123-tom-22
	public static Customer createCustomer(String str) throws InvalidAgeException, InvalidCustomerDetailException {
		String[] data = str.split("-");
		if (data.length!=3) {
			throw  new InvalidCustomerDetailException("Missing Customer Details");
		}
		int id = Integer.parseInt(data[0]);
		int custAge = Integer.parseInt(data[2]);
		if (custAge < 18) {
			throw new InvalidAgeException("Age Should be greater than 17");
		}
		return new Customer(id, data[1], custAge);

	}

}
