package com.demo.day5;

public class Calculator {
	
	private int operand1;
	private int operand2;
	
	public Calculator() {
 	}

	public Calculator(int operand1, int operand2) {
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
		
	public  int add() {
		int sum =operand1 +operand2;
		return sum;
	}
	//multiply only positive numbers
	public  int multiply() {
		int result =-1;
		if (operand1 >0   && operand2 >0) {
			result =operand1 * operand2;
		}
//		int result = operand1 *operand2;
		return result;
	}
	
	public boolean isOperand1Even() {
		return operand1%2==0;
	}
	
	public  int divide() throws InvalidOperandException {
		if (operand1 <=0 ||  operand2<=0) {
			throw new InvalidOperandException("Operand should be  greater than 0");
		}
		return  operand1/operand2;
	}

}
