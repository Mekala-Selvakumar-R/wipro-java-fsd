package com.demo.day8;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class LocalDateDemo2 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// String to LocalDate
		LocalDate d4 = LocalDate.parse("15/12/2004", formatter);
		System.out.println(d4);

		// covert LocalDate to String
		String str = today.format(formatter);
		System.out.println(str);
		System.out.println(today.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy E  w W")));
		System.out.println(d4.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy E  w W")));

		System.out.println(today.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy EEEE")));

		System.out.println(d4.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy EEEE")));

		int d = today.getDayOfMonth();
		int m = today.getMonthValue();
		int y = today.getYear();
		System.out.println(d + "  " + m + "  " + y);

		Month month1 = today.getMonth();
		System.out.println(month1.getValue());
		System.out.println(month1.name());

		String monthName = today.getMonth().name(); // "MAY"
		System.out.println(monthName);
		monthName = today.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);

		System.out.println(monthName); // May
		System.out.println(LocalDate.parse("2026-02-25").getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH));
		System.out.println(LocalDate.parse("2026-02-25").getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH));

//		date.getMonth().getDisplayName(TextStyle.NARROW, Locale.ENGLISH); // M

		// add -day,month,year

		// subtract day,month,year

		LocalDate day10After = today.plusDays(10);
		System.out.println(today);
		System.out.println(day10After);
		System.out.println(today.plusDays(40));

		LocalDate TwoMonthsLater = today.plusMonths(2);
		System.out.println(TwoMonthsLater);
		System.out.println(today.plusWeeks(5));
		System.out.println(today.plusYears(10));

		LocalDate date1 = today.minusMonths(5);
		System.out.println(date1);
		System.out.println(today.minusDays(56));
		System.out.println(today.minusYears(5));
		LocalDate date3 = today.plusDays(40).minusMonths(2).plusYears(6);
		System.out.println(date3);

		LocalDate date5 = today.plus(10, ChronoUnit.DAYS);
		System.out.println(date5);
		System.out.println(today.plus(4, ChronoUnit.MONTHS));
		System.out.println(today.plus(-4, ChronoUnit.MONTHS));
		System.out.println(today.minus(4, ChronoUnit.MONTHS));

	}

}
