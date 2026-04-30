package com.demo.day5;

public class ExceptionDemo5 {

	public static void main(String[] args) {

		int num1 = 15, num2 =2 ;
		int result = 0;
		int[] arr = { 10, 20, 30, 40, 50 };
		try {
			System.out.println(" It is try block -beginning");
			result = num1 / num2;
			System.out.println(result);
			if(result >=5) {
//				return;   //  here before return finally block will be get executed
				System.exit(0);  //finally block will not be executed
			}
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
		finally {
			System.out.println("This is finally block");
			System.out.println("It always get executed -In normal flow as well as exception also");
		
		}
		System.out.println("result  =" + result);
		System.out.println("---End of Program-------");
	}

}
