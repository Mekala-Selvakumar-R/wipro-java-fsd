package com.demo.day1;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
     Scanner  sc = new Scanner(System.in);
     System.out.println("Enter First Number :");
     int num1 =sc.nextInt();
     System.out.println("Enter Second Number");
     int num2=sc.nextInt();
     int sum =num1+num2;
     System.out.println("sum of "+num1 +"   and " +num2 +" is " + sum);
	}

}
