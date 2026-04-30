package com.demo.day7;

public class FunctionalInterfaceDemo1 {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.greet();
		MyFunctionalInterface funInterface = () -> System.out
				.println("Using Lambda expression - functional interface implemented");

		funInterface.greet();
		
		MyFunctionalInterface funInterface1 = () -> {
			System.out.println("Using Lambda expression ");
			System.out.println("functional interface implemented");
		};
		funInterface1.greet();
	}

}
