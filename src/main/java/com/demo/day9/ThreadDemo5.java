package com.demo.day9;

public class ThreadDemo5 {

	public static void main(String[] args) {
		NumRunnable runnable = new NumRunnable();
		Thread t1 = new Thread(runnable, "Thread Child1");
		Thread t2 = new Thread(runnable, "Thread Child2");

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

		System.out.println("End of the program");
	}

}
