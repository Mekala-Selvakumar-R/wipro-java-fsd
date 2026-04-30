package com.demo.day4;

public class InterfaceDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c = new C();
		c.display();

	}

}

interface A {
    default void show() { System.out.println("A"); }
}
interface B {
    default void show() { System.out.println("B"); }
}

class C implements A, B {
	
	public void display() {
	// Duplicate default methods named show with the parameters () and () are inherited from the types B and A
	//	show();
		A.super.show();
		B.super.show();
		
	}
 

	@Override
	public void show() {
 		A.super.show();
	}
	
}




