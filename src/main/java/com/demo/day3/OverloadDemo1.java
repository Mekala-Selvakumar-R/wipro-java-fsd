package com.demo.day3;

public class OverloadDemo1 {
	public static void main(String[] args) {
		Calculator  calc = new Calculator();
		int  num1=10,num2=30,num3=30;
		
		int sum =calc.add(num1, num2);
		System.out.println(sum);
		
		System.out.println(calc.add(num1, num2, num3));
		
		double d1=12.24, d2=45.56;
		
		double result =calc.add(d1, d2);
		System.out.println(result);
		
		System.out.println(calc.add(num1, d1));
		
		float f1=23.f,f2=80.4f;
		
		System.out.println(calc.add(f1, f2));
		
		System.out.println(calc.add(num1, f1));
		
//		System.out.print , println - overloaded method
		//Arrays.sort , fill, copyOf, copyOfRange , binarySearch, ....  - overloaded methodds
	}

}
