package com.demo.day5;

import java.util.Scanner;

public class ExceptionDemo9 {

	public static void main(String[] args) {
		//The constructor Customer() is not visible - it is private
		//Customer customer =new Customer();
		
		
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter Customer details id-name-age");
		String data =sc.next();
		
		try {
			Customer customer = Customer.createCustomer(data);
			System.out.println(customer);
		} catch (InvalidAgeException | InvalidCustomerDetailException | NumberFormatException  e) {
 			//e.printStackTrace();
			System.out.println("Registration failed Unable to create customer. : " +e.getMessage());
		}
		
 
	}

}
