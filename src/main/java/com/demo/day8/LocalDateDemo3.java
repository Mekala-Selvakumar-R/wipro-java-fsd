package com.demo.day8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class LocalDateDemo3 {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		String dobStr = "2004-10-22";

		LocalDate dob = LocalDate.parse(dobStr);

		System.out.println(today.lengthOfMonth());
		System.out.println(today.lengthOfYear());
		System.out.println(dob.isAfter(today));
		System.out.println(dob.isBefore(today));
		System.out.println(dob.isLeapYear());
		// change the specific field
		LocalDate chDate1 = today.withYear(2004);
		System.out.println(today);
		System.out.println(chDate1);

		System.out.println(today.withMonth(12));
		System.out.println(today.withDayOfMonth(24));
		System.out.println(today.with(ChronoField.YEAR, 2000));

		System.out.println("---------------");

		Period period = dob.until(today);
		System.out.println(period);
		System.out.println(period.getYears() + "Years " + period.getMonths() + " Months " + period.getDays() + " Days");

		System.out.println("---------------");
		TemporalAdjuster tempAdjuster1 = TemporalAdjusters.next(DayOfWeek.WEDNESDAY);
		LocalDate nextWednesDay = today.with(tempAdjuster1);
		System.out.println(nextWednesDay);

		System.out.println(today.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));
		// if today is monday, it will return today's date otherwise next monday
		System.out.println(today.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY)));

		System.out.println(today.with(TemporalAdjusters.previous(DayOfWeek.MONDAY)));
		System.out.println(today.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY)));

		System.out.println(today.with(TemporalAdjusters.lastDayOfMonth()));
		System.out.println(today.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println(today.with(TemporalAdjusters.lastDayOfYear()));

		DayOfWeek dow = today.getDayOfWeek();
		System.out.println(dow.name());
		System.out.println(dow.getDisplayName(TextStyle.FULL, Locale.ENGLISH));
		System.out.println(dow.getValue());
	}

}
