package com.demo.day4;

public class StrDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 ==  - used to compare the primitive data type
		int x=10, y=20;
		boolean res = (x==y);
		
		//compare the content of the two different object - use equals method
		// new - create an object in the Heap
		String str1 = new String("Byte Code");
		String str2=new String("Byte Code");
		String str3=new String("byte code");
		//compare the content of the two strings
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1.equals(str3)); //false
		System.out.println(str1.equalsIgnoreCase(str3)); //true
		
		System.out.println(str1==str2);  //compare the references   - false
		System.out.println(str1==str3);  //false
		
		System.out.println("-----------------------");
		// s1 will be created in SCP
		String s1="Object Oriented";
		String s2="Object Oriented";
		String s3="object oriented";
		//compare the content
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
 		System.out.println(s1==s2); //true 
		System.out.println(s1==s3);//false
		
		
		String msg1="New Release - Java";  
		String msg2="New Version";
		System.out.println(msg1.compareTo(msg2));  //R <V  ->   -ve
		System.out.println(msg2.compareTo(msg1));  // V>R  +ve
		
		String msg3="NEw Version";
		System.out.println(msg2.compareTo(msg3));
		System.out.println(msg2.compareToIgnoreCase(msg3));
		
		//fiststring.compareTo(secondstring)  --compareTo  -  0  -equal    -1 - firststring is lesser  +1  - firststring greater
		
		
		String res1 =String.join("-", "one","two","three","four");
		System.out.println(res1);
		
		
		

	}

}
