package com.demo.day6;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		Integer n1 =Integer.valueOf(100);
 		ArrayList<Integer> numList1 =new ArrayList<>();
 		numList1.add(n1);
 		numList1.add(Integer.valueOf(90));
		numList1.add(456);  //autoboxing primitive to wrapper class object
		int  value=236;
		numList1.add(value); //parameter -Integer object, but I am passing int primitive data type - here autoboxing  primitive-wrapper class object
		int length = numList1.size();
		 int sum=0;
		for (int i=0;i<length;i++) {
			Integer intObj = numList1.get(i);  
			System.out.println(intObj);
			sum=sum+intObj;    //auto unboxing intObj  -->primitive type
			
		}
		System.out.println("sum = " +sum);
 		System.out.println("--------------------");

 		ArrayList<String> nameList1 = new ArrayList<>();
 		nameList1.add("Charan");   //append
 		nameList1.add("Vivek Raj");
 		nameList1.add("Meghna");
 		System.out.println(nameList1);
 		nameList1.add(2, "Udaya");  //insert
 		System.out.println(nameList1);
 		nameList1.add(null);
 		nameList1.add(1,null);  //insert
 		nameList1.add("SriKarthikeya");
 		nameList1.add("Vivek Raj");
 		System.out.println(nameList1);
 		
 		

 		
 		
		

	}
	

}
