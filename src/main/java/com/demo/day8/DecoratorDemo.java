package com.demo.day8;

public class DecoratorDemo {

	public static void main(String[] args) {
		// Start with plain coffee
		Coffee myOrder = new SimpleCoffee();

		System.out.println("Order: " + myOrder.getDescription());
		System.out.println("Total Cost: ₹" + myOrder.getCost());
		System.out.println("---------------------");
		// Add Milk
		myOrder = new MilkDecorator(myOrder);
		System.out.println("Order: " + myOrder.getDescription());
		System.out.println("Total Cost: ₹" + myOrder.getCost());
		System.out.println("---------------------");

		// Add Sugar
		myOrder = new SugarDecorator(myOrder);

		System.out.println("Order: " + myOrder.getDescription());
		System.out.println("Total Cost: ₹" + myOrder.getCost());

	}

}

interface Coffee {
	String getDescription();

	double getCost();
}

class SimpleCoffee implements Coffee {
	@Override
	public String getDescription() {
		return "Plain Coffee";
	}

	@Override
	public double getCost() {
		return 50.0;
	}
}

//abstract decorator
abstract class CoffeeDecorator implements Coffee {
	protected Coffee decoratedCoffee;

	public CoffeeDecorator(Coffee coffee) {
		this.decoratedCoffee = coffee;
	}

	public String getDescription() {
		return decoratedCoffee.getDescription();
	}

	public double getCost() {
		return decoratedCoffee.getCost();
	}
}

class MilkDecorator extends CoffeeDecorator {

	public MilkDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return decoratedCoffee.getDescription() + ", Milk";
	}

	@Override
	public double getCost() {
		return decoratedCoffee.getCost() + 20.0;
	}
}

class SugarDecorator extends CoffeeDecorator {
	public SugarDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return decoratedCoffee.getDescription() + ", Sugar";
	}

	@Override
	public double getCost() {
		return decoratedCoffee.getCost() + 10.0;
	}
}
