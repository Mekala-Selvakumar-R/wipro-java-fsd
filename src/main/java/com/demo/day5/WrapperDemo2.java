package com.demo.day5;

public class WrapperDemo2 {
	public static void main(String[] args) {
		//convert String to int
		
		String s ="57534";
		int  n1 = Integer.parseInt(s);
		System.out.println(n1);
		//convert  other number system String to int
		
		//binary to decimal
		int n2= Integer.parseInt("1001", 2);
		System.out.println(n2);
		
		System.out.println(Integer.parseInt("1A",16 ));
		
		System.out.println(Integer.parseInt("32",8));
		System.out.println("----------------------");
		Integer obj1  = Integer.valueOf(200);
		Integer obj2 =Integer.valueOf("100");
		Integer obj3 = Integer.valueOf("200");
		
		System.out.println( obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
		System.out.println(obj1.compareTo(obj3));
		
		System.out.println(Integer.compare(200, 800));
		
		
		// Auto Boxing , Auto unboxing
		
		// Employee e1=1234; - wrong
		//assign primitive data to the object
		//automatically it put the box around it and it create an object
		//object is created with value 100 and it will be assigned to obj
		//auto boxing
		Integer obj=100;
		int  num1=897;
		Integer nObj=num1;
		System.out.println(nObj);
		
		// assign the object  to primitive data type
		//it unbox the primitive data type//only the
		
		//it remove the wrapper around the object and assign only value to the variable
		//onlu the value of the object is assigned to primitive data type
		
		int  num2 = nObj;
		
		
		
		
		
		
	}

}
