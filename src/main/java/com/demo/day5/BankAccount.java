package com.demo.day5;

public class BankAccount {
	private long  accountNumber;
	private double accountBalance;
	private String accountType;
	private BankCustomer  bankCustomer;
	
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}

	public BankAccount(long accountNumber, double accountBalance, String accountType, BankCustomer bankCustomer) {
		super();
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.accountType = accountType;
		this.bankCustomer = bankCustomer;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public BankCustomer getBankCustomer() {
		return bankCustomer;
	}

	public void setBankCustomer(BankCustomer bankCustomer) {
		this.bankCustomer = bankCustomer;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountBalance=" + accountBalance + ", accountType="
				+ accountType + ", bankCustomer=" + bankCustomer + "]";
	}
	

}
