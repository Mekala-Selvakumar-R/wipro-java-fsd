package com.demo.day7;

import java.util.List;
import java.util.stream.Stream;

public class MethodReferenceDemo1 {

	public static void main(String[] args) {
		List<Integer> list1 =List.of(10, 20, 55, 89, 33, 67, 88, 100, 65, 12);
		list1.forEach(n->System.out.println(n));
		System.out.println("-------------------");
		list1.forEach(n->{
			if (n%2==0) {
				System.out.println(n);
			}
		});
		System.out.println("-------------------");
		list1.forEach(System.out::println);
		System.out.println("------------");
		  Stream<Integer> stream=   list1.stream();
		  stream.sorted().forEach(n->System.out.println(n));
		  // Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
    //        long  count = stream.count();
		System.out.println("-----------------");
		//list1 is not sorted
		System.out.println(list1);
		  
		  list1.stream().skip(5).forEach(System.out::println);
		  long count =list1.stream().count();
		  System.out.println("Number of Elements = "+count);
		  
		  Stream<String> nameStream=Stream.of("Javeed","Ankit","Charan","Udaya","Kavya","Ankit","Javeed");
		  
		  nameStream.distinct().forEach(System.out::println);
		  //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed

		 // nameStream.count();
 
	}

}
