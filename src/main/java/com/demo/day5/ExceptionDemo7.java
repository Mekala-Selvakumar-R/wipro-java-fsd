package com.demo.day5;

public class ExceptionDemo7{

	public static void main(String[] args) {

		int num1 = 15, num2 = 2;
		int result = 0;
		int[] arr = { 10, 20, 30, 40, 50 };
		try {
			System.out.println(" It is  outer try block -beginning");
			result = num1 / num2;
			System.out.println(result);
			try {
				int value = arr[result];
				System.out.println("Value = " + value);
				String str = null;
				System.out.println(str.length()); // NullPointerException
				System.out.println("End of inner try block");
			} catch (NullPointerException e) {
				System.out.println(e.getMessage());
			}
//			 catch (ArrayIndexOutOfBoundsException e) {
//					System.out.println(e.getMessage());
//				}
			System.out.println("It is outer try block -end");
		}
		catch (ArithmeticException e) {
			System.out.println("This is catch block " + e);
			result = num1;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("outer try catch block : "+e.getMessage());
		}
		System.out.println("result  =" + result);
		System.out.println("---End of Program-------");
	}

}
