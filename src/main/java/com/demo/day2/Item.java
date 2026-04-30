package com.demo.day2;

public class Item {
	
	private int pri_id;
	public int pub_id;
	int pack_id;
	
	public void  public_method() {
		System.out.println("It is public method");
	}
	private  void  private_method() {
		System.out.println("It is private method");
	}
	 void  pack_method() {
		System.out.println("It is pack level  method");
	}
	 
	 public  void display() {
		 private_method();
	 }
	
	

}
