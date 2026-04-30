package com.demo.day7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MapDemo1 {

	public static void main(String[] args) {
		HashMap<Integer, String> fruitMap = new HashMap<>();
		
		fruitMap.put(1003, "Apple");
		fruitMap.put(1001, "Mango");
		fruitMap.put(1007, "Guava");
		fruitMap.put(1342,"Grapes");
		fruitMap.put(1784, "JackFruit");
		fruitMap.put(1234,"Banana");
		fruitMap.put(null,"Mango");
		fruitMap.put(1345,null);
		fruitMap.put(1278,null);
		System.out.println(fruitMap);
		fruitMap.put(1784, "Papaya");  // if key already exist, the value will be replace
		System.out.println(fruitMap);
		
		String name =fruitMap.get(1342);
		System.out.println(name);
		System.out.println(fruitMap.get(99)); //key not exist - it will retturn  null
		  
   System.out.println("Contains key  1007  : " + fruitMap.containsKey(1007));
   System.out.println("Contains key  99  : " + fruitMap.containsKey(99));
   
   System.out.println("Contains value  'Apple'  : " + fruitMap.containsValue("Apple"));

   System.out.println("Contains value  'Fig'  : " + fruitMap.containsValue("Fig"));

		//get method- one key = one value
     //  all the keys  - to retrieve all the values
   
      Set<Integer> keys=  fruitMap.keySet();
      Iterator<Integer> it =keys.iterator();
      while(it.hasNext()) {
    	  Integer key =it.next();
    	  System.out.println(key +"  " +fruitMap.get(key));
      }
      System.out.println("-----------");
      for (Integer key : keys) {
    	  String name1 =fruitMap.get(key);
    	  System.out.println(key +"  " +name1);
		
	}
      System.out.println("-------------------------");
      Collection<String> values=  fruitMap.values();
      for (String string : values) {
    	  System.out.println(string);
		
	}
//      fruitMap.clear();
//      System.out.println(fruitMap);
//      System.out.println(fruitMap.isEmpty());
      
		
	}

}
