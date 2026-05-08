package com.demo.day9;

public class ThreadDemo1 {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		long id = thread.getId();
		System.out.println("Thread Name : " + name);
		System.out.println("Id = " + id);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println("Current Thread Priority : " + thread.getPriority());
		thread.setName("Sample");
		thread.setPriority(10);
		System.out.println("After Change");

		System.out.println("Current Thread Priority : " + thread.getPriority());
		System.out.println(thread.getName());

	}

}
