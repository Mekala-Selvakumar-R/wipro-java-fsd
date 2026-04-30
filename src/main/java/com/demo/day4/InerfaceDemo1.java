package com.demo.day4;

public class InerfaceDemo1 {

	public static void main(String[] args) {
		//interface - can not instantiate
		//IVehicle  iv1= new  IVehicle();
		IVehicle iv;
		
		iv  = new Car();
		iv.start();
		iv.accelerate();
		iv.brake();
		iv.stop();
		System.out.println("=------------------");
		iv = new Train();
		
		iv.start();
		iv.accelerate();
		iv.brake();
		iv.stop();
 
	}

}
