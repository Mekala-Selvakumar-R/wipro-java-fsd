package com.demo.day6;

import java.util.ArrayList;

public class ArrayListDemo3 {
	public static void main(String[] args) {

		ArrayList<String> nameList1 = new ArrayList<>();
		nameList1.add("Charan");
		nameList1.add("Vivek Raj");
		nameList1.add("Meghana");
		System.out.println(nameList1);
		ArrayList<String> nameList2 = new ArrayList<>();
		nameList2.add("Kavya");
		nameList2.add("Rana");
		System.out.println(nameList2);
		nameList2.addAll(nameList1);
		System.out.println(nameList2);
		nameList2.addAll(1, nameList1);
		
		System.out.println(nameList2);
		
		ArrayList<String> nameList = new ArrayList<>(nameList2);
		System.out.println(nameList);
		
		nameList.remove(2);
		System.out.println("After remove element at 2 nd poistion");
		System.out.println(nameList);
		nameList.remove("Charan");  //string is case sensitive 
		//it remove only the first occurrence
		System.out.println("After remove element :Charan");
		System.out.println(nameList);
		
		System.out.println("nameList isEmpty= " +nameList.isEmpty());
 		
		nameList.clear();  //remove all the objects
		
		System.out.println(nameList);
		System.out.println(nameList.size());
		
		System.out.println("nameList isEmpty= " +nameList.isEmpty());
		
		
		

	}

}
