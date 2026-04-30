package com.demo.day3;

public class ObjectDemo {

	public static void main(String[] args) {
		
		BasicCalculator bc = new BasicCalculator();
		Object obj = new Object();
		Class  classObj =bc.getClass();
		System.out.println(classObj);  // class com.demo.day3.BasicCalculator
        System.out.println(bc.toString()); 
        //  getClass().getName() + '@' + Integer.toHexString(hashCode())
      // com.demo.day3.BasicCalculator@372f7a8d
        
        System.out.println(bc); //implicitly  call the toString() method
        
// if you override the toString method in the BasicCalculator , then  System.out.println(bc); will  execute the 
        //toString overrided method in the BasicCalculator
 
	}

}
