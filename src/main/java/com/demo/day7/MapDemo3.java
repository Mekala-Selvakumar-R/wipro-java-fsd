package com.demo.day7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MapDemo3 {

	public static void main(String[] args) {
		HashMap<Integer, String> fruitMap = new HashMap<>();

		fruitMap.put(1003, "Apple");
		fruitMap.put(1001, "Mango");
		fruitMap.put(1007, "Guava");
		fruitMap.put(1342, "Grapes");
		fruitMap.put(1784, "JackFruit");
		fruitMap.put(1234, "Banana");
		fruitMap.put(2344, "Mango");
 
		System.out.println(fruitMap);
		
		//based on key  - sorted
		TreeMap<Integer, String> map1 = new TreeMap<>();
		
		map1.put(1003, "Apple");
		map1.put(1001, "Mango");
		map1.put(1007, "Guava");
		map1.put(1342, "Grapes");
		map1.put(1784, "JackFruit");
		map1.put(1234, "Banana");
		map1.put(2344, "Mango");
 
		System.out.println(map1);
		TreeMap<Integer, String> map2 = new TreeMap<>(fruitMap);
		System.out.println(map2);
		
		
		Map<Integer, String> map3 = new HashMap();
		
	}

}
