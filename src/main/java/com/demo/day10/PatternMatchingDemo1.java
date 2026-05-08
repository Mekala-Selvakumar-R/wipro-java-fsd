package com.demo.day10;

public class PatternMatchingDemo1 {

	public static void main(String[] args) {
		MyShape shape = new MySquare();
		if (shape instanceof MySquare) {
			MySquare sq = (MySquare) shape;
			// sq.method(); //is is a method of a square
		}

		if (shape instanceof MySquare sq) {
			System.out.println("WIthout type casting - Shape  -->MySquare (sq)");
			// sq.method(); //is is a method of a square
		}

//	    public static double getPerimeter(Shape shape) throws IllegalArgumentException {
//	        if (shape instanceof Rectangle r) {
//	            return 2 * r.length() + 2 * r.width();
//	        } else if (shape instanceof Circle c) {
//	            return 2 * c.radius() * Math.PI;
//	        } else {
//	            throw new IllegalArgumentException("Unrecognized shape");
//	        }
//	    }

	}

//	public static double getPerimeter(MyShape shape) throws IllegalArgumentException {
//        return switch (shape) {
//            case MyRectangle r -> 2 * r.length() + 2 * r.width();
//            case MyCircle c    -> 2 * c.radius() * Math.PI;
//            default          -> throw new IllegalArgumentException("Unrecognized shape");
//        }
//    }
}
