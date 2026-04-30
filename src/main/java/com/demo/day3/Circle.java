package com.demo.day3;

public class Circle extends Shape {
	private double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		double area =Math.PI * radius * radius;
 		return area;
	}

	@Override
	public double calculateCircumference() {
		double circumferece= 2*Math.PI* radius;
 		return circumferece;
	}

	@Override
	public String toString() {
	String str = "Circle [radius=" + radius + " Color = "+  super.getColor()+ " ]";
     return str;
	}
	
	

}
