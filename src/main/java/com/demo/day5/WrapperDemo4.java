package com.demo.day5;

public class WrapperDemo4 {

	public static void main(String[] args) {
 
		Character  chObj1 = Character.valueOf('A');
		Character chObj2 ='a';
		
		System.out.println(Character.isUpperCase('J'));
		System.out.println(Character.isUpperCase('u'));
		System.out.println(Character.isLowerCase('T'));
		
		System.out.println(Character.isDigit('8'));
		System.out.println(Character.isLetterOrDigit('u'));
		System.out.println(Character.isLetterOrDigit('4'));
		System.out.println(Character.isLetterOrDigit('*'));
		
		
		char ch =chObj1.charValue();
		
		System.out.println(Character.getNumericValue('A'));
		
		String str =chObj1.toString();
		
		

	}

}
