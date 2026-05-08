package com.demo.day8;

import java.util.ArrayList;
import java.util.List;

public class ObserverPatternDemo1 {

	public static void main(String[] args) {
		StockMarket market = new StockMarket();

		// Create observers
		MobileApp myPhone = new MobileApp();
		WebDashboard companyMonitor = new WebDashboard();

		// Subscribe to updates
		market.addObserver(myPhone);
		market.addObserver(companyMonitor);

		// Simulate price changes
		System.out.println("Updating Market...");
		market.setPrice("RELIANCE", 2500.50);

		System.out.println("\nUpdating Market Again...");
		market.setPrice("TCS", 3400.75);

	}

}

interface StockObserver {
	void update(String stockSymbol, double price);
}

class StockMarket {
	private List<StockObserver> observers = new ArrayList<>();
	private String stockSymbol;
	private double price;

	public void addObserver(StockObserver observer) {
		observers.add(observer);
	}

	public void removeObserver(StockObserver observer) {
		observers.remove(observer);
	}

	// This is the core logic: telling everyone the news
	public void setPrice(String stockSymbol, double newPrice) {
		this.stockSymbol = stockSymbol;
		this.price = newPrice;
		notifyObservers();
	}

	private void notifyObservers() {
		for (StockObserver observer : observers) {
			observer.update(stockSymbol, price);
		}
	}
}

//Concrete Observer 1: Mobile App
class MobileApp implements StockObserver {
	@Override
	public void update(String stockSymbol, double price) {
		System.out.println("Mobile App: " + stockSymbol + " is now ₹" + price);
	}
}

//Concrete Observer 2: Web Dashboard
class WebDashboard implements StockObserver {
	@Override
	public void update(String stockSymbol, double price) {
		System.out.println("Web Dashboard: Alert! " + stockSymbol + " price changed to ₹" + price);
	}
}
