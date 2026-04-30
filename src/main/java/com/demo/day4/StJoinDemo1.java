package com.demo.day4;

import java.util.StringJoiner;

public class StJoinDemo1 {

	public static void main(String[] args) {
		 StringJoiner sj = new StringJoiner(":", "[", "]");
		 sj.add("George").add("Sally").add("Fred");
		 String desiredString = sj.toString();
		 System.out.println(desiredString);
		 sj.add("Kevin");
		 System.out.println(sj);
		 // Exception in thread "main" java.lang.NegativeArraySizeException: -10

		 //int []arr = new int[-10];
		 // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
		 String s=null;
		// System.out.println(s.length());
		 System.out.println("end of program");

	}

}
