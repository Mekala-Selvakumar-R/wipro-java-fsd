package com.demo.day4;

public class StrDemo2 {

	public static void main(String[] args) {
		int n = 100;
		String str = String.valueOf(n);
		// n - int , str -String
		System.out.println(str.length());
		System.out.println(str);
		// convert int, double, char, char[], boolean etc into a String

		// startsWith, endsWith

		String str1 = "Welcome to Java";
		boolean res1 = str1.startsWith("We");
		System.out.println(res1);
		System.out.println(str1.endsWith("ava"));
		System.out.println(str1.contains("come"));
		
		String str2="   ";
		System.out.println(str2.length());
		System.out.println(str2.isEmpty()); //length==0, return true
		System.out.println("".isEmpty());
		
		System.out.println("--------------");
		// Returns true if the string is empty or contains only white space codepoints, otherwise false.

		System.out.println(str2.isBlank()); //check contain only white spaces
		System.out.println("".isBlank());
		String s1="Java is simple.Java is Roubust.java is secure.Java is Platform Independent";
		String s2 =s1.replace('J', 'K');
		System.out.println(s2);
		String s3 = s1.replaceFirst("Java", "Python");
		System.out.println(s3);
		String s4 = s1.replaceAll("Java", "Python");
		System.out.println(s4);
		
		String s5 = "Hai".repeat(5);
		System.out.println(s5);

	}

}