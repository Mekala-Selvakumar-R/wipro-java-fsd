package com.demo.day7;

@FunctionalInterface
public interface MyFunctionalInterface {
	public void greet();
//	public void display();
	public default void  defaultMetod1() {
		System.out.println("IT is a default method");
	}

}
