package com.demo.day7;

 
public class Product   implements  Comparable<Product>  {
	private int productId;
	private String productName;
	private int price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("%-20s %-25s %-15s", productId, productName, price);
	}

	@Override
	public int compareTo(Product product) {
//		int result=0;
//		if ( this.productId > product.productId) {
//			result =1;
//		}
//		else if (this.productId < product.productId) {
//			result =-1;
//		}
// 		return result;
		//ascending
		return this.productId - product.productId;
		        // 1005             1001
		         //=4
		
		//descending
		//return product.productId - this.productId;
	}



	

	

}
