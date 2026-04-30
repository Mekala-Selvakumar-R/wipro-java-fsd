package com.demo.day4;

public class Car implements IVehicle {

	@Override
	public void start() {
		System.out.println("Car - Starting");
 
	}

	@Override
	public void stop() {
		System.out.println("Car -  stopping");
 
	}

	@Override
	public void accelerate() {
		System.out.println(" Car - acceleate mode");
 
	}

	@Override
	public void brake() {
		System.out.println(" Car is in a Brake mode");
 
	}

}
