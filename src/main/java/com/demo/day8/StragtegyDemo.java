package com.demo.day8;

/*
 * The Strategy design pattern is a behavioral pattern that lets you 
 * define a family of algorithms, put each one into a separate class, 
 * and make their objects interchangeable.
 * 
 * Instead of having one massive class that handles multiple ways of doing something with 
 *  * complex if-else or switch statements, you delegate the task to a "Strategy" object.
 * 
 * Open/Closed Principle: You can add new algorithms (strategies) without changing the existing code.
 * Clean Code: It removes long, nested conditional logic.
 * Runtime Flexibility: You can swap behaviors while the application is running.
 */
public class StragtegyDemo {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		// Use UPI
		cart.setPaymentStrategy(new UpiPayment());
		cart.checkout(500);

		// Change mind and use Credit Card
		cart.setPaymentStrategy(new CreditCardPayment());
		cart.checkout(1200);

		cart.setPaymentStrategy(new CashPayment());
		cart.checkout(4000);

	}

}
//Payment System

interface PaymentStrategy {
	void pay(int amount);
}

class UpiPayment implements PaymentStrategy {
	public void pay(int amount) {
		System.out.println("Paid ₹" + amount + " using UPI.");
	}
}

class CreditCardPayment implements PaymentStrategy {
	public void pay(int amount) {
		System.out.println("Paid ₹" + amount + " using Credit Card.");
	}
}

class CashPayment implements PaymentStrategy {
	public void pay(int amount) {
		System.out.println("Paid ₹" + amount + " By Cash on Delivery.");
	}
}

class ShoppingCart {
	private PaymentStrategy strategy;

	// We can swap the strategy at runtime
	public void setPaymentStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}

	public void checkout(int amount) {
		strategy.pay(amount);
	}
}
