package com.demo.day9;

public class ThreadDemo2 {

	public static void main(String[] args) {

		NumThread t1 = new NumThread("Child 1");
		t1.start(); // start it will invoke run() method internally
		Thread.currentThread().setName("Parent");
		String name = Thread.currentThread().getName();

		for (int i = 1; i <= 5; i++) {
			System.out.println(name + " : " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());

			}
		}

		System.out.println("End of the program");
	}

}
