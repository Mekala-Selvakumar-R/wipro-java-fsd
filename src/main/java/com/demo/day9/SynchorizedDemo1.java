package com.demo.day9;

public class SynchorizedDemo1 {

	public static void main(String[] args) {
		new PrinterThread("Hello...", "There");
		new PrinterThread("How", " are you");
		new PrinterThread("Thank You", " very much");

	}

}

class StringPrinter {
	synchronized static void printString(String stringA, String stringB) {
		System.out.println();
		System.out.print(stringA);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(stringB);
	}
}

class PrinterThread implements Runnable {
	Thread t;
	String stringA;
	String stringB;

	public PrinterThread(String stringA, String stringB) {
		this.stringA = stringA;
		this.stringB = stringB;
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		StringPrinter.printString(stringA, stringB);
	}

}