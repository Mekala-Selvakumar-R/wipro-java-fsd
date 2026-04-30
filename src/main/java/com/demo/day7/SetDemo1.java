package com.demo.day7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		HashSet<Integer> numSet1 = new HashSet<>();
		numSet1.add(890);
		numSet1.add(990);
		numSet1.add(790);
		numSet1.add(690);
		numSet1.add(null);
		numSet1.add(123);
		numSet1.add(475);

		numSet1.add(890); // duplicate element - it won't beadded to the set
		System.out.println(numSet1.size());
		System.out.println(numSet1);

		Iterator<Integer> it = numSet1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("-----------------");
		for (Integer num : numSet1) {
			System.out.println(num);
		}

		List<Integer> list1 = List.of(23, 56, 690, 890, 12, 23, 56);
        //order get changed, duplicated removed
		HashSet<Integer> numSet2 = new HashSet<>(list1);
		System.out.println(numSet2);
		
		Set<Integer> numSet3 = new HashSet<>();
		numSet3.addAll(list1);
		System.out.println(numSet3);
		
		Set<Integer> numSet4 = new  HashSet<>(list1);
		System.out.println(numSet4);
		System.out.println("--------------");
		System.out.println(numSet1);
		numSet1.addAll(list1);
		System.out.println(numSet1);
		
		//unmodifiable set
          Set<Integer> numSet	=Set.of(56,67,34,56,67,44,33);
          System.out.println(numSet);

	}

}
