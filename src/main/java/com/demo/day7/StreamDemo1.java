package com.demo.day7;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String[] args) {
		List<Integer> list1 = List.of(10, 20, 55, 89, 33, 67, 88, 100, 65,6, 88, 12, 33);

		list1.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

		List<Integer> list2 = list1.stream().filter(n -> n % 2 == 0).distinct().sorted().toList();
		System.out.println(list2);
		List<Integer> oddList = list1.stream().filter(n -> n % 2 != 0).distinct().sorted().collect(Collectors.toList());
		System.out.println(oddList);

		Optional<Integer> op = list1.stream().filter(n -> n == 33).findFirst();
		if (op.isPresent()) {
			System.out.println(" Object found : " + op.get());
		} else {
			System.out.println("Object Not found");
		}

		System.out.println(op.isEmpty());
		System.out.println(op.isPresent());
		
		long  min =list1.stream().min(Integer::compare).get();
		System.out.println(min);
		
		int result=  list1.stream().min((n1,n2)->n1-n2).get();
		System.out.println(result);
		
		Optional<Integer> op1 =list1.stream().min(Integer::compare) ;
		if (op1.isPresent()) {
			System.out.println(op1.get());
		}
		
	      long max =list1.stream().max(Integer::compare).get();
	      System.out.println(max);
		
	}

}
