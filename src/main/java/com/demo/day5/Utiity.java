package com.demo.day5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utiity {
	//checked exception
	public static Date  strToDate(String str) throws ParseException {
		SimpleDateFormat  sdf = new SimpleDateFormat("dd/MM/yyyy"); //28/04/2026
		sdf.setLenient(false);
		//Unhandled exception type ParseException - checked exception
		//it force the programmer to handle the exception during compile time
		// handle - try .. catch , throws
		 Date  date=  sdf.parse(str);
		 return  date;
	}
	
	//unchecked exception
	public static int divide(int operand1, int operand2) throws  ArithmeticException {
		int q=operand1/operand2;
		return 1;
	}

}
