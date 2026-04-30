package com.demo.day7;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) {
		List<Integer> list1 = List.of(10, 20, 55, 89, 33, 67, 88, 100, 65, 6, 88, 12, 33);
		List<Integer> list2 = List.of(10, 2, 5, 8, 7, 11, 2, 5, 9, 2);
		// transform the data
		Set<Integer> set1 = list2.stream().map(n -> n * n).collect(Collectors.toSet());
		System.out.println(set1);

		list1.stream().filter(n -> n > 50).map(n -> n * 2).distinct().limit(3).forEach(System.out::println);

		  IntSummaryStatistics stat=list1 .stream().collect(Collectors.summarizingInt(Integer::intValue));
		  System.out.println("Max =" +stat.getMax());
		  System.out.println("Min = " +stat.getMin());
		  System.out.println("Average = " +stat.getAverage());
		  System.out.println("Count = " +stat.getCount());
		  System.out.println("Sum = " +stat.getSum());
		  
			list1.stream().filter(n -> n > 50)
			.peek(n->System.out.println("n = "+n))
			.map(n -> n * 2).distinct()
 			.limit(3).forEach(System.out::println);
			System.out.println("---------------------");
			
			list1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		  
		    
	}

}
