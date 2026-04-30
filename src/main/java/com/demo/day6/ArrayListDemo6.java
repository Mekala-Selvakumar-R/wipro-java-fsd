package com.demo.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo6 {

	public static void main(String[] args) {
		ArrayList<Integer> numList1 = new ArrayList<>();
		List<Integer> numList2 = new ArrayList<>();
		numList2.add(100);
		numList2.add(300);
		System.out.println(numList2);
		// methods available in List interface can be used
		// the methods which is unique to ArrayList class can not be accessible
		// because numList2 is of type List

		// Returns an unmodifiable list containing.See Unmodifiable Lists for details.
		// unmodifiable list
		List<Integer> numList3 = List.of(10, 60, 100);
		System.out.println(numList3);
		// Exception in thread "main" java.lang.UnsupportedOperationException
		// because numList3 - unmodifiable list
		// numList3.add(300);
		List<Integer> numList4 = List.of(10, 60, 100, 89, 34, 789);
		System.out.println(numList4);

		// arrays to List
		Integer[] arr = { 100, 400, 400, 345, 23, 12 };

//		Integer[] arr = new Integer[]{ 100, 400, 400, 345, 23, 12 };
//unmodifiable list
		List<Integer> numList5 = Arrays.asList(arr);
		System.out.println(numList5);
		// Exception in thread "main" java.lang.UnsupportedOperationException

		// numList5.add(898);

		ArrayList<Integer> numList6 = new ArrayList<>(numList5);
		numList6.add(898);
		
		System.out.println(numList6);
		numList6.set(3, 876);
		System.out.println(numList6);
		//list to array
		
		Object[] arr1 = numList6.toArray();
		for (Object obj :arr1) {
			Integer nObj=(Integer)obj;
			System.out.println(nObj);
			
		}
System.out.println("----------------------");
		Integer [] arr2 = new Integer[numList6.size()];
		arr2 = numList6.toArray(arr2);
		for (Integer num : arr2) {
			System.out.println(num);
		}
		

	}

}
