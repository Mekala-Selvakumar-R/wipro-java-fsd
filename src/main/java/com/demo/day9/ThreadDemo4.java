package com.demo.day9;

public class ThreadDemo4 {

	public static void main(String[] args) {
		MyThreadRunnable runnable = new MyThreadRunnable("First");
		Thread t1 = new Thread(runnable);
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
