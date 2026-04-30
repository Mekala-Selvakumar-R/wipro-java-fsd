package com.demo.day7;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product product1, Product product2) {
 		return product1.getPrice() - product2.getPrice();
	}

 
	

}
