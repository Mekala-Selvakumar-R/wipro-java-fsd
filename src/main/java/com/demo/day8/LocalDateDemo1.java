package com.demo.day8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class LocalDateDemo1 {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();

		System.out.println(today);

		LocalDate d1 = LocalDate.of(2007, 9, 24);
		System.out.println(d1);

		LocalDate d2 = LocalDate.parse("2004-12-15");
		System.out.println(d2);
		// Exception in thread "main" java.time.format.DateTimeParseException: Text
		// '2004-12-33' could not be parsed: Invalid value for DayOfMonth (valid values
		// 1 - 28/31): 33
		// LocalDate d3= LocalDate.parse("2004-12-33");
		// Exception in thread "main" java.time.format.DateTimeParseException: Text
		// '2004/12/15' could not be parsed at index 4
//		LocalDate d3= LocalDate.parse("2004/12/15");
		// System.out.println(d3);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date in format yyyy-MM-dd");
		String str = sc.next();

		try {
			LocalDate date = LocalDate.parse(str);
			System.out.println("Valid Date : " + date);
		} catch (DateTimeParseException e) {
			System.out.println("Invalid Date : " + e.getMessage());
		}

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate d4 = LocalDate.parse("15/12/2004", formatter);
		System.out.println(d4);

	}

}
