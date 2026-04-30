package com.demo.day7;

import java.util.List;
import java.util.Vector;

public class VectDemo1 {

	public static void main(String[] args) {
	Vector<Integer> v1= new Vector<>();
	v1.add(100);
	v1.add(null);
	v1.add(890);
	System.out.println(v1);
	
	List<Integer> list =List.of(435,67,78,23,11,45,90);
	Vector<Integer> v2 = new Vector<>(list);
	
	v1.addAll(list);
	System.out.println(v2);
	System.out.println(v2.firstElement());
	System.out.println(v2.lastElement());
	
 
	}

}
