package com.demo.day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo4 {
	public static void main(String[] args) {

		ArrayList<String> nameList1 = new ArrayList<>();
		nameList1.add("Kavya");
		nameList1.add("Charan");
		nameList1.add("Vivek Raj");
		nameList1.add("Meghana");
		nameList1.add("Kavya");
		nameList1.add("Rana");
		nameList1.add("Javeed");

		System.out.println("-----------for loop -----------------");
		int n = nameList1.size();
		for (int i = 0; i < n; i++) {
			String name = nameList1.get(i);
			System.out.println(name);
		}
		System.out.println("--------------forEach-----Enhanced for loop-------------");
		for (String name : nameList1) {
			System.out.println(name);
		}
		System.out.println("------iterator------------------");

		Iterator<String> it = nameList1.iterator();
//		boolean result = it.hasNext();
//		while (result) {
//			String name = it.next();
//			System.out.println(name);
//			result = it.hasNext();
//		}
		while (it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
		//Exception in thread "main" java.util.NoSuchElementException
		//System.out.println(it.next());
		//again i have to reinitialize the it variable
		//traversal from first to last
		
		System.out.println("-----list-iterator------------------");
		//traversal from first to last , last to first
		
		ListIterator<String> listit = nameList1.listIterator();
		while(listit.hasNext()) {
			String name =listit.next();
			System.out.println(name);
		}
		System.out.println("****");
		while(listit.hasPrevious()) {
			String name =listit.previous();
			System.out.println(name);
		}


	}

}
