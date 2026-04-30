package com.demo.day4;

public class MyTrain implements IVehicle, IPublicTransport {

	@Override
	public int getNumberOfPeople() {
		return 1500;
	}

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
