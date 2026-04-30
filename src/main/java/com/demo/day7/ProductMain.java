package com.demo.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductMain {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1003, "Crayons", 150));
		productList.add(new Product(1004, "Color Papers", 100));
		productList.add(new Product(1002, "Sketch", 75));
		productList.add(new Product(1005, "Pen", 200));
		productList.add(new Product(1001, "Water Color", 250));
		display(productList);
		System.out.println("-------Sort - Based on Product Id");
		Collections.sort(productList);
		display(productList);
		ProductNameComparator nameComparator = new ProductNameComparator();
		System.out.println("-------Sort - Based on Product Name");
		Collections.sort(productList, nameComparator);
		display(productList);
		System.out.println("-------Sort - Based on Product Price");
		Collections.sort(productList, new PriceComparator());
		display(productList);
       System.out.println("--------");
		Collections.sort(productList, Comparator.reverseOrder());
		display(productList);


	}

	private static void display(List<Product> productList) {
		System.out.printf("\n%-20s%-25s%-15s\n", "Product Id", "Product Name", "Price");
		 String line = "-".repeat(60);
		System.out.println(line);
		for (Product product : productList) {
			System.out.println(product);
		}
		System.out.println(line);

	}

}
