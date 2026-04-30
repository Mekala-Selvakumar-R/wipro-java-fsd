package com.demo.day4;

import java.awt.DisplayMode;

public class InterfaceDmo2 {

	public static void main(String[] args) {
		//Run time Poly
		IVehicle  iv  =new MyCar();
		display(iv);
		iv = new MyTrain();
		display(iv);
 
	}

	public static void display(IVehicle iv) {
		iv.start();
		iv.accelerate();
		iv.brake();
		iv.stop();
		// iv is of type IVehicle , IVehicle doesn't have the method getNumberOfPeople()
		// iv.getNumberOfPeople();
		if (iv instanceof MyTrain) {
			MyTrain myTrain = (MyTrain) iv;
			System.out.println(myTrain.getNumberOfPeople());
		}
		if (iv instanceof MyCar) {
			MyCar myCar = (MyCar) iv;
			myCar.checkMotor();
		}

		System.out.println("=------------------");
	}

}
