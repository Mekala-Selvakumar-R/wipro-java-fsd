package com.demo.day8;

public class FactoryPatternDemo1 {

	public static void main(String[] args) {

		Shape shape = ShapeFactory.getShape("circle");
		shape.draw();
		shape = ShapeFactory.getShape("rectangle");
		shape.draw();

	}

}

interface Shape {
	void draw();
}

class Circle implements Shape {
	public void draw() {
		System.out.println("Circle");
	}
}

class Rectangle implements Shape {
	public void draw() {
		System.out.println("Rectangle");
	}
}

class ShapeFactory {
	public static Shape getShape(String type) {
		if (type.equals("circle"))
			return new Circle();
		if (type.equals("rectangle"))
			return new Rectangle();
		return null;
	}
}
