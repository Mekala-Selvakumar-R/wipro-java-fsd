package com.demo.pack1;

import com.demo.day3.BasicCalculator;

public class InheritanceDemo {
	public static void main(String[] args) {
		BasicCalculator  bc = new BasicCalculator();
		bc.setOperand1(100);
		bc.setOperand2(200);
		System.out.println(bc.add());
		// proVar - not visible
		//other package - non subclass cannot access the  protected variable
		//System.out.println(bc.proVar);
	}

}
