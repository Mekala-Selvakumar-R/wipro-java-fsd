package com.demo.day6;

import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		// hetrogenous
		ArrayList list1 = new ArrayList<>();
		System.out.println(list1.size()); // no elements - 0
		Integer n1 = Integer.valueOf(100);
		Float f1 = Float.valueOf(12.34f);
		String name = "Charan";

		list1.add(n1);
		list1.add(f1);
		list1.add(name);
// list1.add(Object e);   - it allows to add any type of an object
		System.out.println(list1.size()); // 3
		System.out.println(list1); // [100, 12.34, Charan]
		// implicitly it call the toString method of a ArrayList class

		list1.add(Integer.valueOf(456));

		// to retrieve the element - get method
		Object obj = list1.get(0);
		System.out.println(obj);
		System.out.println(list1.get(2));
		System.out.println(list1);
		// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 7 out
		// of bounds for length 4
		// System.out.println(list1.get(7));

		int n = list1.size();
		double sum = 0;
		//it is hetrogenous, so it is diffifcult to process
		for (int i = 0; i < n; i++) {
			Object obj1 = list1.get(i);
			System.out.println(list1.get(i));
			// The operator + is undefined for the argument type(s) double, Object
			// sum=sum+obj1;
			if (obj1 instanceof Number) {     
				Number number = (Number) obj1;
				sum = sum + number.doubleValue();
			}

		}
		System.out.println(sum);

		//homogenous - it is easy to process
		ArrayList<Integer> numList1 =new ArrayList<>();
		// numList1.add(Integer e); - it allows you to add only Integer object
		numList1.add(n1);
		//The method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (Float)
		//numList1.add(f1);
		
		
		//ArrayList<Integer> numList1 =new ArrayList<>();
		//<Integer>  - Generics - it help you to store same type of an object
		
		numList1.add(Integer.valueOf(90));
		numList1.add(456);  //autoboxing primitive to wrapper class object
		
		int  value=236;
		numList1.add(value); //parameter -Integer object, but I am passing int primitive data type - here autoboxing  primitive-wrapper class object
		System.out.println("--------------------");
		int length = numList1.size();
		 sum=0;
		for (int i=0;i<length;i++) {
			Integer intObj = numList1.get(i);
			System.out.println(intObj);
			sum=sum+intObj;    //auto unboxing intObj  -->primitive type
			
		}
		System.out.println("sum = " +sum);
		

	}
	

}
