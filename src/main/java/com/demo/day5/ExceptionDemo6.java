package com.demo.day5;

public class ExceptionDemo6 {

	public static void main(String[] args) {

		int num1 = 15, num2 = 4;
		int result = 0;
		int[] arr = { 10, 20, 30, 40, 50 };
		try {
			System.out.println(" It is try block -beginning");
			result = num1 / num2;
			System.out.println(result);
			if (result >= 5) {
//				return;   //  here before return finally block will be get executed
				System.exit(0); // finally block will not be executed
			}
			int value = arr[result];
			System.out.println("Value = " + value);
			String  str=null;
			System.out.println(str.length()); //NullPointerException
			System.out.println("It is try block -end");
		} 
//		catch(Exception  e) {
//			System.out.println("Super class exception handler");
//			System.out.println(e.getMessage());
//			// Exception e = new NullPointerException();
//		}
//		Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
		catch (ArithmeticException e) {
			System.out.println("This is catch block " + e);
			result = num1;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception  e) {
			System.out.println("Super class exception handler");
			System.out.println(e.getMessage());
			// Exception e = new NullPointerException();
		}

		System.out.println("result  =" + result);
		System.out.println("---End of Program-------");
	}

}
