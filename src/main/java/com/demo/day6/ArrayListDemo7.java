package com.demo.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo7 {

	public static void main(String[] args) {
	
		List<Integer> numList1 = List.of(10, 60, 100, 89, 34, 12,789);
		ArrayList<Integer> numList2 = new ArrayList<>(numList1);
		System.out.println("Before Sort");
		System.out.println(numList2);
		
		Collections.sort(numList2);
		System.out.println("After Sort");
		System.out.println(numList2);
 

	}

}
