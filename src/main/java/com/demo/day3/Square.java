package com.demo.day3;

public class Square extends Shape {
	
	private double side;
	

	public Square(String color , double side) {
		super(color);
		this.side=side;
 	}

	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	@Override
	public double calculateArea() {
 		return side* side;
	}

	@Override
	public double calculateCircumference() {
 		return 4*side;
	}

}
