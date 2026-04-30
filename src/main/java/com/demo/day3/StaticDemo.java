package com.demo.day3;

public class StaticDemo {

	public static void main(String[] args) {
		Counter.stCount=100;
		System.out.println("stCount = "+ Counter.stCount);

		Counter c1 = new  Counter();
		c1.count=999;
		System.out.println("c1.count = " +c1.count);
		System.out.println("stCount = " +c1.stCount);
		c1.stCount++;
		c1.count++;
		System.out.println("-------------------------");
		Counter c2 = new  Counter();
		c2.count=888;
		System.out.println("c2.count = " +c2.count);
		System.out.println("stCount = " +c2.stCount);
		c2.stCount++;
		c2.count++;
		System.out.println("-------------------------");
		System.out.println("stCount = "+ Counter.stCount);

		  Counter.staticMethod();
		  // Arrays.sort()
		  c1.nonStaticMethod();
	}

}
// Counter.java 
//public class Counter{
//	
//	
//}

class Counter{
	//static variable
	static  int stCount;
	//instance variable
	int count;
	
	//static method can access only static member
	public static  void  staticMethod() {
		stCount++;
		//Cannot make a static reference to the non-static field count
		//count++;
	}
	// nonstatic method can access - both static and non static members
	public void nonStaticMethod() {
		count++;
		stCount++;
	}
	
	
	
}