package com.demo.day4;

public class InheritanceDemo5 {

}

final class AA {
	void show() {
		System.out.println("Class AA");
	}
}

interface BB {
	default void show() {
		System.out.println("Interface BB");
	}
}

// The inherited method AA.show() cannot hide the public abstract method in BB
//class CC extends AA {
//implements BB {
//}
// The type CC cannot subclass the final class AA

class  Person {
	
	final public void  displayName() {
	System.out.println(" This is Person");
	}
}

class Student extends Person {
	// 	- Cannot override the final method from Person
//	void displayName() {
//		
//	}
	
}