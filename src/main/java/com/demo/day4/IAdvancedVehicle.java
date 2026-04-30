package com.demo.day4;


// one interface extends multiple interfaces
//interface interfacename extends interface1,interface2,.....

public interface IAdvancedVehicle extends IVehicle{
	public void turnLeft();
	public void turnRight();
	public void reverse(); 

}

class AdvancedCar implements IAdvancedVehicle {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnRight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		
	}
	
}