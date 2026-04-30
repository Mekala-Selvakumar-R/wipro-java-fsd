package com.demo.day5;

public class OpenCloseDemo {

	public static void main(String[] args) {

		Circle c1 = new Circle(10.5);
		Rectangle r1 = new Rectangle(10, 20);
		Triangle t1 = new Triangle(10, 50);
		AreaCalculator calc = new AreaCalculator();
		System.out.println(calc.calculate(c1));
		System.out.println(calc.calculate(r1));
		System.out.println(calc.calculate(t1));
	}
}

class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double calculateArea() {
		System.out.println("Circle - area");
		return Math.PI * radius * radius;
	}
}

class Rectangle implements Shape {
	private double length;
	private double breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public double calculateArea() {
		System.out.println(" Rectangle -area");

		return length * breadth;
	}
}

// Adding Triangle? Just create a new class — no existing code touched!
class Triangle implements Shape {
	private double base;
	private double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double calculateArea() {
		System.out.println("Triangle- area");

		return 0.5 * base * height;
	}
}

 
class AreaCalculator {
	public double calculate(Shape shape) {
		return shape.calculateArea(); // Works for ALL shapes!
	}
}
