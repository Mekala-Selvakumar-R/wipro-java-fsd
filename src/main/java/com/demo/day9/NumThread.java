package com.demo.day9;

public class NumThread extends Thread {
	String threadname;

	public NumThread(String threadName) {
		this.threadname = threadName;

	}

// contain thread logic
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
