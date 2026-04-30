package com.demo.day3;

public class ScientificCalculator extends BasicCalculator {
	// hiding of the varaible - not preferable
	// private int operand1;

	private int operand3;
	// Implicit super constructor BasicCalculator() is undefined. Must explicitly invoke another constructor
	 public ScientificCalculator() {
		 super(20,30);
		 System.out.println("Construcor - ScientificCalcualtor");
		 operand3=800;
 	}
	 
	 
	public ScientificCalculator(int operand1, int operand2, int operand3) {
		super(operand1, operand2);
		this.operand3 = operand3;
	}



	public int getOperand3() {
		return operand3;
	}

	public void setOperand3(int operand3) {
		this.operand3 = operand3;
	}

	public int addition() {
		int sum = getOperand1() + getOperand2() + operand3;
		return sum;
	}

	public double mySqrt() {
		return Math.sqrt(operand3);
	}

	public void display() {
		System.out.println("Display method from Scientific Calulator");
		System.out.println("Protected member from super class = " + proVar);
		printMsg();  // current class method
		super.printMsg();  // super class printMsg() will be called
	}
	// hiding the method -not preferable way
//		public static void  staticMethod() {
//			System.out.println("static method -BasicCalculator");
//		}
	// we are overriding the method which is available in the superclass
	// we are changing the implementation of the method

//	@Override
	
//	- overrides com.demo.day3.BasicCalculator.printMsg
//	- Cannot reduce the visibility of the inherited method from BasicCalculator
//	 void 	printMsg() {
//		System.out.println("This is from ScientificCalulator");
// 	}
	
	 public void 	printMsg() {
		System.out.println("This is from ScientificCalulator");
	}

}
