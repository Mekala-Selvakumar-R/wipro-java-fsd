package com.demo.day5;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class ExceptionDemo8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dob :");
		String dob = sc.next();
		try {
			Date date = Utiity.strToDate(dob);
			System.out.println("Date is Valid : " + date);
		} catch (ParseException e) {
			System.out.println("Invalid date : " + e.getMessage());
			e.printStackTrace();
		}

		// unchecked
		try {
			int result = Utiity.divide(10, 0);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		int n1=200,n2=0;
		ArithmeticException exception = new ArithmeticException("Divide by Zero");
		if (n2==0) {
			throw exception;
//			throw new ArithmeticException("Divide by Zero");
		}

	}

}
