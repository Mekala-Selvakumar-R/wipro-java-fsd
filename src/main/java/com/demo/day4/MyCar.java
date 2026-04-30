package com.demo.day4;

public class MyCar extends  MotorizedVehicle  implements IVehicle {

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

	@Override
	public void checkMotor() {
		System.out.println( " THe condition of the Car Motor is Good");
 		
	}

}
