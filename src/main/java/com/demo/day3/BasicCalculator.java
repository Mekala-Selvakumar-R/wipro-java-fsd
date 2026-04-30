package com.demo.day3;

public class BasicCalculator {
	
	private int operand1;
	private int operand2;
	
	
	protected  int proVar;
	
	public BasicCalculator() {
		System.out.println("Constructor - Basic Calculator");
		operand1=100;
		operand2=200;
 	}
	
	public BasicCalculator(int operand1, int operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
 	}

	public int getOperand1() {
		return operand1;
	}
	public void setOperand1(int operand1) {
		this.operand1 = operand1;
	}
	public int getOperand2() {
		return operand2;
	}
	public void setOperand2(int operand2) {
		this.operand2 = operand2;
	}
	public int add() {
		int sum = operand1 + operand2;
		return sum;
	}
	
	public void printMsg() {
		System.out.println("This is from BasicCalulator");
	}
	
	public static void  staticMethod() {
		System.out.println("static method -BasicCalculator");
	}
// overrides java.lang.Object.toString
	@Override
	public String toString() {
		return "BasicCalculator [operand1=" + operand1 + ", operand2=" + operand2 + "]";
	}
	
 
	

}
