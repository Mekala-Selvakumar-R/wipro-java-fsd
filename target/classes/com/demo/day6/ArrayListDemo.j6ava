package com.demo.day6;

import java.util.ArrayList;

public class ArrayListDemo5 {

	public static void main(String[] args) {
		ArrayList<String> nameList1 = new ArrayList<>();
		nameList1.add("Kavya");
		nameList1.add("Charan");
		nameList1.add("Vivek Raj");
		nameList1.add("Meghana");
		nameList1.add("Kavya");
		nameList1.add("Rana");
		nameList1.add("Javeed");
		nameList1.add("Kavya");
		nameList1.add("Kavya");

		ArrayList<String> nameList2 = new ArrayList<>();
		nameList2.add("Kavya");
 		nameList2.add("Rana");
		nameList2.add("Javeed");
		nameList2.add("Ankit");
		
		System.out.println(nameList1);
		System.out.println(nameList2);
		
//		nameList1.removeAll(nameList2);
		// remove all the elements of nameList2 from nameList1 - all occurrence
		// if the element not available - it won't give any error message
//		System.out.println(nameList1);
		String name1="Rana";
		String name2="Ankit";
		//search element
		boolean found =nameList1.contains(name1);
		System.out.println(found);
		System.out.println(nameList1.contains(name2));
		
		found =nameList1.containsAll(nameList2);
		System.out.println(found);
		
		ArrayList<String> nameList3 = new ArrayList<>();
		nameList3.add("Kavya");
 		nameList3.add("Rana");
		nameList3.add("Javeed");
		System.out.println(nameList1.containsAll(nameList3));
 		
		//only nameList2 elements will be retained in the nameList1
		// rest of the elements will be removed
//		nameList1.retainAll(nameList2);
		System.out.println(nameList1);
		
		
		
		//indexOf - search - from the first last
		//found - return the index position
		//not found   -1
		
		int pos =nameList1.indexOf("Kavya");
		System.out.println(pos);
		System.out.println(nameList1.indexOf("Charan"));
		System.out.println(nameList1.indexOf("Ankit"));
		
		//lastIndexOf -search from last to first
		
		System.out.println(nameList1.lastIndexOf("Charan"));
		System.out.println(nameList1.lastIndexOf("Ankit"));
		
		System.out.println(nameList1.lastIndexOf("Kavya"));

		
	}

}
