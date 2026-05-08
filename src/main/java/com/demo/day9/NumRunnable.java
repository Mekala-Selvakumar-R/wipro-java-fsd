package com.demo.day9;

public class NumRunnable implements Runnable {

	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		String threadname = currentThread.getName();
		System.out.println(threadname + " Priority : " + currentThread.getPriority());
		for (int i = 11; i <= 15; i++) {
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
