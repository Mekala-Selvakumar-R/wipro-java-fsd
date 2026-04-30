package com.demo.day5;

public class Demo {

	public static void main(String[] args) {
 
		BankCustomer   customer = new BankCustomer(123456, "Jerry");
		
		BankAccount  bankAccount = new  BankAccount(1, 50000, "Savings", customer);
		
		System.out.println(bankAccount);
		
		System.out.println(bankAccount.getAccountNumber());
		System.out.println(bankAccount.getAccountBalance());
		BankCustomer  cust1 = bankAccount.getBankCustomer();
		System.out.println(bankAccount.getBankCustomer().getCustomerId());
		System.out.println(cust1.getCustomerName());
	}

}
