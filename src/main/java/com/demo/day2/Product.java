package com.demo.day2;

public class Product {
	private int productId;
	private String productName;
	private int price;

	public int getProductId() {
		return productId;
	}
	//parameter name and instance variable names are same, priority goes to parameter(local variable)
	//how to differentiate the local variable and instance variable
	//this keyword
	// this refer the current object
	public void setProductId(int  productId) {
		//localvariable =localvariable
		//productId=productId
		//instance variable =localvariable
		this.productId=productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
