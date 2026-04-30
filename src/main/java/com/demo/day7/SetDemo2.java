package com.demo.day7;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {

	public static void main(String[] args) {
		//maintains the insertion order
		LinkedHashSet<Integer> numSet1 = new LinkedHashSet<>();
		numSet1.add(890);
		numSet1.add(990);
		numSet1.add(790);
		numSet1.add(690);
		numSet1.add(null);
		numSet1.add(123);
		numSet1.add(475);
		System.out.println(numSet1);
		
		
		TreeSet<Integer> numSet2 = new TreeSet<>();
		numSet2.add(890);
		numSet2.add(990);
		numSet2.add(790);
		numSet2.add(690);
		//null is not allowed
		//numSet2.add(null);
		numSet2.add(123);
		numSet2.add(475);
		
		System.out.println(numSet2);
		
		Set<Integer> numSet3 =Set.of(78,45,34,99,66,55);
		TreeSet<Integer> numSet4 = new TreeSet<>(numSet3);
		
		Set<Integer> numSet5 = new TreeSet<>(numSet3);
		System.out.println(numSet5);
     		
		System.out.println(numSet2.first());
		System.out.println(numSet2.last());
		
	}

}
