package com.demo.day2;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {

	Scanner  sc = new Scanner(System.in);
	System.out.println("Enter Number of elements");
	int n = sc.nextInt();
	int []arr = new int[100]; // if n is 10 -90 memory space will be wasted , n>100 - we can't store more than 100
	int []arr1 = new int[5];
	for(int i=0;i<n;i++) {
		System.out.println("Enter arr["+i+"] : ");
		arr1[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		System.out.println("arr["+i+"] : " +arr1[i]);
 	}
	
	
	}

}
