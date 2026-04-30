package com.demo.day2;

import java.util.Scanner;

public class ArrayDemo4 {

	public static void main(String[] args) {

	Scanner  sc = new Scanner(System.in);
	System.out.println("Enter Number of elements");
	int n = sc.nextInt();
	int []arr = new int[n];
 
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter arr["+i+"] : ");
		arr[i]=sc.nextInt();
	}
	System.out.println("Array Elements");
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+"  ");
 	}
	System.out.println();
	System.out.println("Enter Element to search");
	int element =  sc.nextInt();
	boolean found=false;
	for(int i =0;i<arr.length;i++) {
		if (arr[i]==element) {
			System.out.println("Element Found at Position " +i);
			found=true;
			break;
 		}
	}
 	if (found==false) {
		System.out.println("Element not found");
	}
	

	
	
	}

}
