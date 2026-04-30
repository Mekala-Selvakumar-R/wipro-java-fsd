package com.demo.day6;

public class Box<Type> {
	private Type length;
	private Type breadth;

	public Box(Type length, Type breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public Type getLength() {
		return length;
	}

	public void setLength(Type length) {
		this.length = length;
	}

	public Type getBreadth() {
		return breadth;
	}

	public void setBreadth(Type breadth) {
		this.breadth = breadth;
	}

//	public double calculateArea() {
//		return length * breadth;
//	}

}
