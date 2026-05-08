package com.demo.day9;

public class RaceConditionDemo {

	public static void main(String[] args) {
		Counter c = new Counter();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				System.out.println("thread 1: " + c.count);
				c.increment();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				System.out.println("thread 2: " + c.count);
				c.increment();
			}
		});

		t1.start();
		t2.start();
		System.out.println(c.count);
		System.out.println("End of Program");
	}

}

class Counter {
	int count = 0;

	synchronized void increment() {
		count++; // Not atomic
	}
}
