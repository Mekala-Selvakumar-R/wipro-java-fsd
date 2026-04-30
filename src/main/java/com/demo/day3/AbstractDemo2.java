package com.demo.day3;

public class AbstractDemo2 {

	public static void main(String[] args) {
       //super class referece = sub class object
		// higher =lower
		// up casting (implicit casting) - automatic
		Shape shape = new Square("aqua", 89.9);
		display(shape);
		shape = new Circle("red", 34.56);
		display(shape);
	}

	public static void display(Shape shape) {
		System.out.println(shape.getColor());
		System.out.println(shape.getClass());
		System.out.println(shape); //implicitly call the toString()
		System.out.println(shape.calculateArea());
		System.out.println(shape.calculateCircumference());
		if (shape instanceof Circle) {
			//sub class refererce =  superclass referece
			//down casting
			// lower = higher
			Circle c1 = (Circle)shape;
			System.out.println("Radius = " +c1.getRadius());
		}
		
		if (shape instanceof  Square) {
			Square s1 =(Square)shape;
			System.out.println("Side = "  +s1.getSide());
			
		}
		System.out.println("----------------------------");

	}

}
