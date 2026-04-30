package com.demo.day3;

public class InheritanceDemo3 {

	public static void main(String[] args) {
		Animal animal = new  Animal();
		animal.sound();
		animal.printName();
 
		System.out.println("--------------------------");
		Dog dog = new Dog();
		dog.sound();
		dog.printName();
		dog.displayName();
		System.out.println("----------------------");
		//Runtime Polymorphism
		//super class reference variable can hold the reference of the sub class object
		Animal animal1 = new Dog();
		animal1.sound(); //here method invocation will be decided during run time. so Dog class sound() method will be called
		animal1.printName();
		// The method displayName() is undefined for the type Animal 
		// you cant access the subclass method with the super class reference variable
		//animal1.displayName();
		
		
 
	}

}
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
    void printName() {
    	System.out.println("printName - Animal");
    	
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
    void displayName() {
    	System.out.println("displayName - Dog");
    }
    
}
class Cat extends Animal {
	void sound() {
		System.out.println( "meow");
	}
}

