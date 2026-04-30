package com.demo.day6;

public class BoxFloat{
	private Float length;
	private Float breadth;

	public BoxFloat(Float length, Float breadth) {
 		this.length = length;
		this.breadth = breadth;
	}

	public Float getLength() {
		return length;
	}

	public void setLength(Float length) {
		this.length = length;
	}

	public Float getBreadth() {
		return breadth;
	}

	public void setBreadth(Float breadth) {
		this.breadth = breadth;
	}

	public double calculateArea() {
		return length * breadth;
	}

}
