package com.demo.day4;

public class SbDemo1 {

	public static void main(String[] args) {
 
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer(30);
		StringBuffer sb3 = new StringBuffer("Welcome to Java");
		System.out.println(sb1.length() +"   " +sb1.capacity()); //0  16
		System.out.println(sb2.length()+" " +sb2.capacity()); //0   30
		System.out.println(sb3.length()+"  " +sb3.capacity()); //15   31
		System.out.println(sb3);
		sb3.append(false);
		System.out.println(sb3);
		System.out.println(sb3.length());
		
		int n=100;
		double d1=45.56;
		sb3.append(n);
		sb3.append("Hai");
		sb3.append(d1);
		System.out.println(sb3);
		
		sb3.insert(4, 789);
		System.out.println(sb3);

		sb3.insert(5,"Hello");
		System.out.println(sb3);
		
		//charAt, indexOf , lastIndexOf, substring  
		//length
		
		sb3.setCharAt(1, 'U');
		System.out.println(sb3);
		
		sb3.deleteCharAt(4);
		System.out.println(sb3);
		sb3.delete(5, 10); // 5 to 9
		System.out.println(sb3);
		
		sb3.replace(4, 11, "REPLACE STRING") ; //4 RO 10
		System.out.println(sb3);
		
	}

}
