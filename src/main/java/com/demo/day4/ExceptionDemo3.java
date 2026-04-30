package com.demo.day4;

public class ExceptionDemo3 {

	public static void main(String[] args) {

		int num1 = 10, num2 = 0;
		int result = 0;
		try {
			System.out.println(" It is try block -beginning");
			result = num1 / num2;
			// I am having try catch block - but there is no matching catch block, it will throw
			//an exception to the run time environment and terminate the application
			System.out.println(result);
			System.out.println("It is try block -end");
		} 
		catch(NullPointerException e) {
			System.out.println("Unrelated exception - Unmatching");
			result =num1;
		}
//		catch (ArithmeticException e) {
//			System.out.println("This is catch block - if exception occurs only catch block will be get executed");
//			System.out.println(e);
//			System.out.println(e.getMessage());
//			result = num1;
//		}
		System.out.println("result  =" +result);
		System.out.println("---End of Program-------");
	}

}
