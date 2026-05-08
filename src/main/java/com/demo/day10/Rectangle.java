package com.demo.day10;

//parameterized constructor
//getter method  -  variablename()
//length()
//equals and hashcode , toString()
//record Rectangle(double length, double width) {
//}

public record Rectangle(double length, double width) {
	// User declared non-static fields color are not permitted in a record
	// private String color;
	public Rectangle(double length, double width) {
		if (length <= 0 || width <= 0) {
			throw new java.lang.IllegalArgumentException(String.format("Invalid dimensions: %f, %f", length, width));
		}
		this.length = length;
		this.width = width;
	}

	public double length() {
		System.out.println("Length is " + length);
		return length;
	}

	public void setLength(int length) {
		// The final field Rectangle.length cannot be assigned
//		this.length = length;
	}

	// static fields, static methods are allowed
	// Static field
	static double goldenRatio;

	// Static initializer
	static {
		goldenRatio = (1 + Math.sqrt(5)) / 2;
	}

	// Static method
	public static Rectangle createGoldenRectangle(double width) {
		return new Rectangle(width, width * goldenRatio);
	}

	// Nested record class
	record RotationAngle(double angle) {
		public RotationAngle {
			angle = Math.toRadians(angle);
		}
	}

	// instance methods are allowed
	public Rectangle getRotatedRectangleBoundingBox(double angle) {
		RotationAngle ra = new RotationAngle(angle);
		double x = Math.abs(length * Math.cos(ra.angle())) + Math.abs(width * Math.sin(ra.angle()));
		double y = Math.abs(length * Math.sin(ra.angle())) + Math.abs(width * Math.cos(ra.angle()));
		return new Rectangle(x, y);
	}

}
//A record class is implicitly final, so you cannot explicitly extend a record class. However, beyond these restrictions, record classes behave like normal classes:

// You can declare a record class that implements one or more interfaces, for example:

// record Customer(...) implements Billable { }
//record Rectangle(double length, double width) {
//	 
//    // Public accessor method
//    public double length() {
//        System.out.println("Length is " + length);
//        return length;
//    }
//}