package com.demo.day10;

record Person(String name, int age) {
	public void display() {
		System.out.println("Greetings ....");
	}
}

public class RecordMain1 {

	public static void main(String[] args) {
		Person person = new Person("Alice", 30);

		// Accessing the fields
		System.out.println(person.name()); // Alice
		System.out.println(person.age()); // 30

		// Using auto-generated methods
		// toString()
		System.out.println(person);
		person.display();
	}

}
