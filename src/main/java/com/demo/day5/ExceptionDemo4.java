package com.demo.day5;

public class ExceptionDemo4 {

	public static void main(String[] args) {

		int num1 = 10, num2 = 2;
		int result = 0;
		int[] arr = { 10, 20, 30, 40, 50 };
		try {
			System.out.println(" It is try block -beginning");
			result = num1 / num2;
			System.out.println(result);
			int value = arr[result];
			System.out.println("Value = " + value);
			System.out.println("It is try block -end");
		} catch (ArithmeticException e) {
			System.out.println("This is catch block " + e);
			result = num1;
		}
		catch(ArrayIndexOutOfBoundsException  e) {
			System.out.println(e.getMessage());
		}
		System.out.println("result  =" + result);
		System.out.println("---End of Program-------");
	}

}
