package com.demo.day7;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo4 {
	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 45, 50 };

		IntStream stream1 = Arrays.stream(array);
		stream1.filter(s -> s % 2 == 0).forEach(System.out::println);

		long r = Stream.of(10, 20, 30).count();
		System.out.println(r);

		Integer[] numArr = { 10, 20, 78, 54, 21, 333 };
		Stream stream2 = Arrays.stream(numArr);
		stream2.sorted().forEach(System.out::println);

		Arrays.stream(numArr).filter(n -> n % 2 == 0).forEach(System.out::println);

		Stream<Integer> stream3 = Stream.of(numArr);

//	int []arr = {89,3,44,22,33};
//    Stream stream3 =Stream.of(arr);
		List<Integer> numList1 =List.of(10, 20, 55, 89, 33, 67, 88, 100, 65, 12);

		double result = numList1.stream().collect(Collectors.averagingInt(Integer::intValue)).doubleValue();
		System.out.println(result);
		int sum1 = numList1.stream().collect(Collectors.summingInt(Integer::intValue)).intValue();

		System.out.println("-----------------------");
		int sum = numList1.stream().collect(Collectors.summingInt(Integer::valueOf));
		System.out.println(sum);

		System.out.println("-------------------------------");
		Optional<Integer> sumOp = numList1.stream().reduce(Integer::sum);
		System.out.println(sumOp.get());

		// summungInt - sum of all numbers
		// summerizing - aggregate statistics - min, max,sum,avg,count

	}
}
