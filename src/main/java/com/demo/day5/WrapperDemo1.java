package com.demo.day5;

public class WrapperDemo1 {

	public static void main(String[] args) {

		Integer obj1 = Integer.valueOf(789);

		int n = obj1.intValue();
		byte b = obj1.byteValue();
		short s = obj1.shortValue();
		long l = obj1.longValue();
		float f1 = obj1.floatValue();
		double d1 = obj1.doubleValue();
		System.out.println(d1);
		System.out.println(l);

		Integer obj2 = Integer.valueOf("5678");
		System.out.println(obj2);
		// Exception in thread "main" java.lang.NumberFormatException: For input string:
		// "56ABC78"
//		Integer  obj3 =Integer.valueOf("56ABC78");
//		System.out.println(obj3);

		// String to Integer  obj
		Integer obj4 = Integer.valueOf("101", 2); // binary
		System.out.println(obj4);
		// binary string to decimal (Integer)

		// int to String

		// decimal to binary,octal,hexa dicimal
		String res1 = Integer.toString(3456);
		System.out.println(res1);
		// octal
		String res2 = Integer.toString(13, 8);
		System.out.println(res2);
		// hexadecial
		System.out.println(Integer.toString(26, 16));

		String binStr = Integer.toBinaryString(17);
		System.out.println(binStr);

		System.out.println(Integer.toString(15, 4)); // 33

		System.out.println(Integer.toHexString(23));
		System.out.println(Integer.toOctalString(56));
		
		
		int total =Integer.sum(10, 20);
		System.out.println("total = "+total);
		System.out.println("Minimum = " +Integer.min(45, 33));
		System.out.println("Maximum = "+Integer.max(56, 12));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
	}

}
