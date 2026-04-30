package com.demo.day3;

public class StaticDemo2 {

	public static void main(String[] args) {
		//main - static - so - static method can access other static member
		printMsg();
		// Cannot make a static reference to the non-static method display() from the type StaticDemo2
	 //sstatic method - can not access non static method
		//display()

		StaticDemo2  st = new StaticDemo2();
		st.printMsg();
		
		final int MAX=100;
		final int MAX_SIZE=10;
		System.out.println(MAX);
		// error -->  MAX=300;

 
	}
	
	public void display() {
		System.out.println("Hi I am a non static method");
	}
	public static void  printMsg() {
		System.out.println("Hi I am a static Method");
	}

}
