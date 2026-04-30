package com.demo.day2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo6 {

	public static void main(String[] args) {

		int[] arr = { 78, 45, 34, 22, 77, 56, 34, 11, 99, 45 };
		System.out.println(Arrays.toString(arr));
		Arrays.fill(arr, 100);
		System.out.println(Arrays.toString(arr));
		Arrays.fill(arr, 3, 8,800);  //fill 3 to 7
		System.out.println(Arrays.toString(arr));
		int[] arr1 = { 78, 45, 34, 22, 77 };
		int [] arr2=Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		int[]arr3 = Arrays.copyOf(arr2, 3);
		System.out.println(Arrays.toString(arr3));
		int[]arr4 = Arrays.copyOf(arr2, 10);
		
		
		System.out.println(Arrays.toString(arr4));
		
		int[] myArr = { 78, 45, 34, 22, 77, 56, 34, 11, 99, 45 };
		int[]myArr1 =Arrays.copyOfRange(myArr, 3, 9);  //3 to 8
		//Any of your arrays operation , if the index exceed its size - it will thrown an exception ArrayIndexOutOfBoundsException
		System.out.println(Arrays.toString(myArr1));

		int[]myArr2 =Arrays.copyOfRange(myArr, 3, 15);   //  3 to 14
		System.out.println(Arrays.toString(myArr2));
		
		int[] myArr3 = {78,  45, 34, 22, 77, 56, 34, 11, 99, 45 };
		System.out.println(Arrays.equals(myArr, myArr3));
		//it compare myArr[0], with myArr3[0] etc
		//forEach, enhanced for loop
		for (int element : myArr3) {
			System.out.println(element);
		}
		
		
		




		



	}

}
