package com.demo.day8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateDemo4 {

	public static void main(String[] args) {

		LocalTime present = LocalTime.now();
		System.out.println(present);
		LocalDateTime dt1 = LocalDateTime.now();
		System.out.println(dt1);

		LocalDateTime dt2 = dt1.withHour(14);
		// withMiunte , withSecond
		System.out.println(dt2);
		LocalDate d1 = LocalDate.now();
		System.out.println(d1);
		LocalDateTime dt3 = d1.atTime(present);
		System.out.println(dt3);
		LocalDateTime dt4 = d1.atTime(10, 30, 20);
		System.out.println(dt4);
		System.out.println(d1.atTime(12, 30));

	}

}
