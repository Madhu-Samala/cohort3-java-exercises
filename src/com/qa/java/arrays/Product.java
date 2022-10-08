package com.qa.java.arrays;

public class Product {
	
	
	int id;
	String name;
	double price;
	String category;
	float rating;
	float discountPercentage;
	boolean isAvailable;
	
	
	
	public Product(int id, String name, double price, String category, float rating, float discountPercentage,
			boolean isAvailable) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.rating = rating;
		this.discountPercentage = discountPercentage;
		this.isAvailable = isAvailable;
	}
	
	void displayProductInfo() {
		System.out.printf("%-8d %-20s %-10.2f %-10s %-10.2f %-15.2f %-10s \n" , id, name,price,category,rating,discountPercentage,isAvailable);
		
	}
	
	
	double productDiscountPrice() {
		return price * discountPercentage / 100;
	}
	
	double productFinalPrice() {
		return price - productDiscountPrice();
	}
	
	

}
