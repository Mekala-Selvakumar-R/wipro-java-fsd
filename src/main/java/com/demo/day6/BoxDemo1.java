package com.demo.day6;

public class BoxDemo1 {

	public static void main(String[] args) {
		
		Box  box = new Box(10, 20.0);
		System.out.println(box.getBreadth());
		System.out.println(box.getLength());
		
		
		Box<Float> b1 = new Box<Float>(23.3f, 45.5f);
		Box<Integer> b2 = new Box<Integer>(34, 56);
		System.out.println(b1.getBreadth());  //method returns Float
		System.out.println(b2.getBreadth()); //returns Integer object
		
		
 
	}

}
