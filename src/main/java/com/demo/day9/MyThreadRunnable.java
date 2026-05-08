package com.demo.day9;

public class MyThreadRunnable implements Runnable {
	private String threadname;

	public MyThreadRunnable(String threadname) {
		this.threadname = threadname;
	}

	@Override
	public void run() {

		Thread currentThread = Thread.currentThread();
		currentThread.setName(threadname);
		System.out.println(threadname + " Priority : " + currentThread.getPriority());
		for (int i = 11; i <= 20; i++) {
			System.out.println(threadname + " : " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
				// break;
			}
		}

	}

}
