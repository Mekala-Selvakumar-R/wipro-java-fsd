package com.demo.day4;

import java.util.Scanner;

public class SbDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome to Java";
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
		//sb - no equals method
		//compareTo(StringBuffer another) - only compareTo is available 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str1 =sc.nextLine();
		StringBuffer sb1 = new StringBuffer(str1);
		sb1.reverse();
		System.out.println(sb1);
		//only same type of an can be checked they are equal or not
		// here i am checking String and StringBuffer are  equal or not which is incorrect
//		if (str1.equals(sb1)) {
		if (str1.equals(sb1.toString())) {
			System.out.println("Given String is a Palindrome");
		}
		else {
			System.out.println("Given String is not a Palindrome");
		}
 

	}

}
