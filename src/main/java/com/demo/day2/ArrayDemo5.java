package com.demo.day2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo5 {

	public static void main(String[] args) {

//	Scanner  sc = new Scanner(System.in);
//	System.out.println("Enter Number of elements");
//	int n = sc.nextInt();
//	int []arr = new int[n];
// 
//	for(int i=0;i<arr.length;i++) {
//		System.out.println("Enter arr["+i+"] : ");
//		arr[i]=sc.nextInt();


		int[] arr = { 78, 45, 34, 22, 77, 56, 34, 11, 99, 45 };
		System.out.println("Array Elements - Before Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();

//		Arrays.sort(arr);
		
		Arrays.sort(arr,2,7);
		System.out.println("Array Elements - After Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
		System.out.println(arr);
	   String res= Arrays.toString(arr);
	   System.out.println(res);
	   
	   System.out.println(Arrays.toString(arr));

	}

}
