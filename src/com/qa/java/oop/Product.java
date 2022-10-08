package com.qa.java.oop;

public class Product {
	
	//Working With Objects
	//1.1 Creating Product class with the properties
	
	int id;
	String name;
	double price;
	String category;
	float rating;
	float discountPercentage;
	boolean isAvailable;
	
	/*
	 * 4.1 Create the static variables
	 */
	static final String SELLER_NAME = "Apple Rio Private Ltd";
	static final String SELLER_CONTACTNO = "+1 (484) 234-345";
	static final String SELLER_EMAIL = "contact@applerio.com";
	
	
	//2.1 NO-arg Constructor
	public Product() {
		id = 111;
		name = "Mac Book Air";
		price = 1179.0;
		category = "laptop";
		rating = 4.8f;
		discountPercentage = 7.8f;
		isAvailable = true;
	}

	
	//2.2 Arg Constructor
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
	
	//3 Working with Methods
	// Method for displaying product information
	void displayProductInfo() {
		System.out.printf("%-8d %-20s %-10.2f %-10s %-10.2f %-15.2f %-10s \n" , id, name,price,category,rating,discountPercentage,isAvailable);
		
	}
	
	//Method to calculate the discount price
	
	double productDiscountPrice() {
		return price * discountPercentage / 100;
	}
	
	//Method to calculate the final price after the discount
	double productFinalPrice() {
		return price - productDiscountPrice();
	}
	
	/*
	 * 4.2 Static method to print the seller information
	 */
	
	static void sellectContactDetails() {
		System.out.printf("%-30s %-20s %-30s", SELLER_NAME,SELLER_CONTACTNO,SELLER_EMAIL);
	}
	
	
	
	
	

}
