package com.demo.day3;

public class AbstractDemo1 {

	public static void main(String[] args) {
		// Cannot instantiate the type Shape - because it is a abstract class
		//Shape  shape = new Shape();
		
//		Shape shape;
		
		Circle c1 = new Circle("red", 25.5);
		Square s1 = new Square("green", 10.5);
		System.out.println(" --- Circle----");
		System.out.println(c1);
		System.out.println("Area =  "+ c1.calculateArea());
		System.out.println(" Circumference = "+c1.calculateCircumference());
	   System.out.println( " ----- Square ---------");
	   System.out.println(s1);
	   System.out.println("Area = " +s1.calculateArea());
	   System.out.println("Circumferece = " +s1.calculateCircumference());
		System.out.println("----------------------------");
 
		
		//runtime  poly
		//super class reference variable hold the sub class object
		Shape shape = c1;
		Shape sh1 = new Circle("blue",34.45);
		System.out.println(shape.getColor());
	//	System.out.println(shape.getRadius()); // shape is of type Shape, so we can't access radius - because it is a Circle class property
	   System.out.println(shape);  // it call the toString() method of  Circle
	   System.out.println(shape.calculateArea()); // circle's  calculateArea() will be called
	   System.out.println(shape.calculateCircumference());
	   
	   
	   shape = new Square("aqua",89.9);
		System.out.println(shape.getColor());
		   System.out.println(shape);  // it call the toString() method of  Square
		   System.out.println(shape.calculateArea()); // square's  calculateArea() will be called - 
		   // but there is no toString()  in the Square, it will check the super class Shape
		   //Shape also doesn't have toString(), so finally it will call toString() method of Shape's super class - Object . Object toString() method will be called
		   
		   
		   System.out.println(shape.calculateCircumference());

		
	}

}
