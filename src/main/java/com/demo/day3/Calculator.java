package com.demo.day3;

public class Calculator {
	
	public int add(int operand1, int operand2) {
		System.out.println("add - int, int");
		int sum = operand1 +operand2;
		return sum;
	}
	//return data type - not considered for method overloading
//	public double add(int operand1, int operand2) {
//		System.out.println("add - int, int");
//		double sum = operand1 +operand2;
//		return sum;
//	}
	
	public int add(int operand1, int operand2, int operand3) {
		System.out.println("add - int,int,int");
		int sum = operand1 +operand2 +operand3;
		return sum;
	}
	
	public  double add(double operand1, double operand2) {
		System.out.println("add - double,double");
		double sum =operand1+operand2;
		return sum;
	}
	
	public double add(int operand1, double operand2) {
		System.out.println("add - int, double");
		double sum = operand1 +operand2;
		return sum;
	}

}
