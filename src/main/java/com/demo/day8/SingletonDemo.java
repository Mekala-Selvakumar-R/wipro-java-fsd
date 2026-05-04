package com.demo.day8;

public class SingletonDemo {

	public static void main(String[] args) {
//The constructor AccountManager() is not visible - constrctor - private
//		AccountManager manager = new AccountManager();

		AccountManager manager = AccountManager.getInstance();
		System.out.println(manager.hashCode());
		AccountManager manager1 = AccountManager.getInstance();
		System.out.println(manager1.hashCode());
	}

}
