package com.demo.day9;

public class ThreadDemo3 {

	public static void main(String[] args) {

		NumThread t1 = new NumThread("Child 1");
		NumThread t2 = new NumThread("Child 2: ");
		t1.start(); // start it will invoke run() method internally
		t2.start();
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

		try {
			t1.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End of the program");
	}

}
