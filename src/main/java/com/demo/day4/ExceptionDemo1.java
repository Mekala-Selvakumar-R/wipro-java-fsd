package com.demo.day4;

public class ExceptionDemo1 {

	public static void main(String[] args) {
 
		 int num1=10,num2=0;
		 // Exception in thread "main" java.lang.ArithmeticException: / by zero
		 int result =num1/num2;
		 //jvm will create an ArithmeticException object, and then check whether this exception is handled
		 // by the program, if not  it throw an exception object to the run time environment and terminates the progra
		 
		 System.out.println(result);
		 System.out.println("---End of Program-------");
	}

}
