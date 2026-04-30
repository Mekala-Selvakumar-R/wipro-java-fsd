package com.demo.day7;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo3 {

	public static void main(String[] args) {
		List<Integer> list2 = List.of(10, 2, 5, 8, 7, 11, 2, 5, 9, 2);

		long s1 = list2.stream().filter(n -> n >= 10).reduce(0, (x, y) -> x + y);
		System.out.println(s1);

		long s2 = list2.stream().filter(n -> n >= 10).reduce(Integer::sum).get();
	System.out.println(s2);
	}

}
