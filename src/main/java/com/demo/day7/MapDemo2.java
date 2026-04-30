package com.demo.day7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MapDemo2 {

	public static void main(String[] args) {
		HashMap<Integer, String> fruitMap = new HashMap<>();

		fruitMap.put(1003, "Apple");
		fruitMap.put(1001, "Mango");
		fruitMap.put(1007, "Guava");
		fruitMap.put(1342, "Grapes");
		fruitMap.put(1784, "JackFruit");
		fruitMap.put(1234, "Banana");
		fruitMap.put(null, "Mango");
		fruitMap.put(1345, null);
		fruitMap.put(1278, null);
		System.out.println(fruitMap);

		Set<Entry<Integer, String>> entries = fruitMap.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
		System.out.println("--------------");
		Iterator<Entry<Integer, String>> it = entries.iterator();
		while(it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey()+ " " +entry.getValue());
		}

	}

}
