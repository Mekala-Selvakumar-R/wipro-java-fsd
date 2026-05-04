package com.demo.day8;

public class AccountManager {
	private static AccountManager accountManager;

	private AccountManager() {

	}

	public static AccountManager getInstance() {
		if (accountManager == null) {
			System.out.println("Creating Account Manager");
			accountManager = new AccountManager();
		}
		return accountManager;
	}

}
