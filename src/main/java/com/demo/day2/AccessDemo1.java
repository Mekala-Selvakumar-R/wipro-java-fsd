package com.demo.day2;

public class AccessDemo1 {

	public static void main(String[] args) {
 
		Item item = new Item();
		item.pub_id=100;
		item.pack_id=200;
		// The field Item.pri_id is not visible
		//It is a private variable which can be accessible only within the class
		//item.pri_id=123;
		// it is a private method, can;t access outside the class
		//item.private_method();
		
		item.pack_method();
		
	}

}
