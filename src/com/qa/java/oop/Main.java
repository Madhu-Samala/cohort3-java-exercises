package com.qa.java.oop;

public class Main {

	public static void main(String[] args) {
		/*
		//Working with Classes & Objects
		//1.2 Create 3 products by giving appropriate Values
		Product product1;
		product1 = new Product();
		product1.id = 111;
		product1.name = "Mac Book Pro";
		product1.price = 1179.0;
		product1.category = "laptop";
		product1.rating = 4.8f;
		product1.discountPercentage = 8.3f;
		product1.isAvailable = true;
		
		
		Product product2;
		product2 = new Product();
		product2.id = 222;
		product2.name = "Mac Book Air";
		product2.price = 2739.0;
		product2.category = "laptop";
		product2.rating = 4.9f;
		product2.discountPercentage = 5.8f;
		product2.isAvailable = false;
		
		Product product3;
		product3 = new Product();
		product3.id = 333;
		product3.name = "Mac Book Air M1";
		product3.price = 2679.0;
		product3.category = "laptop";
		product3.rating = 4.4f;
		product3.discountPercentage = 6.8f;
		product3.isAvailable = true;
		
		//1.3 Print 3 object values 
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.printf("%-8s %-20s %-10s %-10s %-10s %-15s %-10s \n", "ID","PRODUCT","PRICE","CATEGORY","RATING","DISCOUNT(%)","IN STOCK");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.printf("%-8d %-20s %-10.2f %-10s %-10.2f %-15.2f %-10s \n" , product1.id, product1.name,product1.price,product1.category,product1.rating,product1.discountPercentage,product1.isAvailable);
		System.out.printf("%-8d %-20s %-10.2f %-10s %-10.2f %-15.2f %-10s \n" , product2.id, product2.name,product2.price,product2.category,product2.rating,product2.discountPercentage,product2.isAvailable);
		System.out.printf("%-8d %-20s %-10.2f %-10s %-10.2f %-15.2f %-10s \n" , product3.id, product3.name,product3.price,product3.category,product3.rating,product3.discountPercentage,product3.isAvailable);
		*/
		
		
		/*
		 * 2.2 Setting product values using Arg constructor
		 */
		
		Product product1;
		product1 = new Product(111,"Mac Book Pro",1179.0,"laptop",4.8f,8.3f,true);
		
		Product product2;
		product2 = new Product(222,"Mac Book Air",2739.0,"laptop",4.9f,5.8f,false);		
				
		Product product3;
		product3 = new Product(333,"Mac Book Air M1",2689.0,"laptop",4.4f,6.8f,true);
		
		/*
		 * 3.4 Invoking methods
		 */
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.printf("%-8s %-20s %-10s %-10s %-10s %-15s %-10s \n", "ID","PRODUCT","PRICE","CATEGORY","RATING","DISCOUNT(%)","IN STOCK");
		System.out.println("----------------------------------------------------------------------------------------");
		
		product1.displayProductInfo();
		product2.displayProductInfo();
		product3.displayProductInfo();
		
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.printf("%-8s %-20s %-10s %-15s %-15s %-15s   \n", "ID","PRODUCT","PRICE","DISCOUNT(%)","DISCOUNT","FINAL PRICE");
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.printf("%-8d %-20s %-10.2f %-15.2f %-15.2f %-15.2f  \n" , product1.id, product1.name,product1.price,product1.rating,product1.discountPercentage,product1.productDiscountPrice(), product1.productFinalPrice());
		System.out.printf("%-8d %-20s %-10.2f %-15.2f %-15.2f %-15.2f  \n" , product1.id, product1.name,product1.price,product1.rating,product1.discountPercentage,product1.productDiscountPrice(), product1.productFinalPrice());
		System.out.printf("%-8d %-20s %-10.2f %-15.2f %-15.2f %-15.2f  \n" , product1.id, product1.name,product1.price,product1.rating,product1.discountPercentage,product1.productDiscountPrice(), product1.productFinalPrice());
		
		/*
		 * 4.2 
		 * Invoking Static method
		 */
		System.out.println("-------------------------------------------------------------------------");
		System.out.printf("%-30s %-20s %-30s \n", "NAME","CONTACT NO","E-MAIL");
		System.out.println("-------------------------------------------------------------------------");
		Product.sellectContactDetails();
	}

}
