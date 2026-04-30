package com.demo.day2;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayDemo3 {

	public static void main(String[] args) {

	Scanner  sc = new Scanner(System.in);
	System.out.println("Enter Number of elements");
	int n = sc.nextInt();
	//we can declare the array size during run time
	//if n is 10 - size of the array is 10
	// if n is 5 - array size 5
	int []arr1 = new int[n];

 	for(int i=0;i<n;i++) {
		System.out.println("Enter arr["+i+"] : ");
		arr1[i]=sc.nextInt();
	}
 	
	for(int i=0;i<arr1.length;i++) {
		System.out.println("arr["+i+"] : " +arr1[i]);
 	}
 
	
	
 	
	
	}

}
