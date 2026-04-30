package com.demo.day4;

public class Train implements IVehicle {

	@Override
	public void start() {
		System.out.println("Train is  in start mode");

	}

	@Override
	public void stop() {
		System.out.println("Train is in Stop Mode");
	}

	@Override
	public void accelerate() {
		System.out.println("Train - Accelerate Mode");
 
	}

	@Override
	public void brake() {
		System.out.println("Train -Brake Mode");

 
	}

}
