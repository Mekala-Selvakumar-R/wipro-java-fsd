package com.demo.day4;

public class StrDemo1 {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = new String("Hello");
		char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f' };
		String str3 = new String(arr);
		System.out.println(str3);
		String str4 = new String(arr, 1, 4);
		System.out.println(str4);

		String msg = "Welcome to Java Programming";
		int len = msg.length();
		System.out.println("Length = " + len);
		String subStr1 = msg.substring(3);
		System.out.println(subStr1);
		String subStr2 = msg.substring(3, 13); // 3 to 12
		System.out.println(subStr2);
		char ch = msg.charAt(3);
		System.out.println(ch);
		
		String msg1="Welcome to";
		String msg2=" Java";
		String result =msg1.concat(msg2);
		System.out.println(msg1); //welcome to
		System.out.println(result); //welcome to Java
		
		//Once created, string can be modified
		
		msg1.toUpperCase();
		System.out.println(msg1);
		String upperStr = msg1.toUpperCase();
		System.out.println(upperStr);
		System.out.println("msg1 = "+msg1);
		String  msg3="HELLO  how ARe You";
		String  lowerStr =msg3.toLowerCase();
		System.out.println(lowerStr);
		System.out.println(msg3);
		String  myMsg ="  Welcome to Java  ";
		System.out.println(myMsg.length());
		String  strip1 = myMsg.stripLeading();
		System.out.println(strip1.length());
		System.out.println(myMsg);
		System.out.println(strip1);
		
		String strip2 = myMsg.stripTrailing();
		String  strip =myMsg.strip();
		System.out.println(strip);
		System.out.println(strip.stripLeading().stripTrailing());
		char [] arr1 = myMsg.toCharArray();
		for(char ch1 : arr1) {
			System.out.println(ch1);
		}
		
		

	}

}
