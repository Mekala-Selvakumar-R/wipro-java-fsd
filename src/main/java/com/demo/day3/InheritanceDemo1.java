package com.demo.day3;

public class InheritanceDemo1 {

	public static void main(String[] args) {

		BasicCalculator bc = new BasicCalculator();
		bc.setOperand1(100);
		bc.setOperand2(200);
		System.out.println(bc.add());
		bc.printMsg();
		System.out.println("-------------------");

		ScientificCalculator sc = new ScientificCalculator();
		sc.setOperand1(345);
		sc.setOperand2(456);
		System.out.println(sc.add());
		sc.printMsg();
		
		sc.setOperand3(81);
		System.out.println(sc.mySqrt());
		sc.display();
		
		System.out.println(sc.proVar);

	}

}
