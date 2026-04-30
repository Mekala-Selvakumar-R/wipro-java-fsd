package com.demo.day5;

public class WrapperDemo3 {
	public static void main(String[] args) {
		
		Double d1 = Double.valueOf("123.45");
		Double d2 =Double.valueOf(123.45);
		
		double res = Double.parseDouble("123.5678");
		System.out.println(res);
	
		//isNaN
		//isFinitie
		//isInfinite
		
		Boolean  b1 = Boolean.valueOf("true");
		System.out.println(b1);
		System.out.println(b1.booleanValue());
		boolean  b2 = Boolean.parseBoolean("true");
		
		System.out.println(b2);
		
	}

}
