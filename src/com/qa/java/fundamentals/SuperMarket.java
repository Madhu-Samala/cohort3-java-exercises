package com.qa.java.fundamentals;

public class SuperMarket {

	public static void main(String[] args) {
		/*
		 * Whole SuperMarket has announced an anniversary sale with the discounts on the
		 * products as below. 
		 * Product 			Price(Kg) 	Discount(%) 
		 * Apple    		3.25£     	10% 
		 * Chicken Fillets 	7.25£ 		8% 
		 * Banana 			1.25£ 		3%
		 * 
		 * Calculate the final price after the discount and display.
		 * 
		 */

		float applePricePerKg = 3.25f;
		float appleDiscountPercentage = 10.0f;
		float appleFinalPricePerKg;
		appleFinalPricePerKg = applePricePerKg - (applePricePerKg * appleDiscountPercentage / 100);

		float chickenFilletsPricePerKg = 3.25f;
		float chickenFilletsDiscountPercentage = 8.0f;
		float chickenFilletsFinalPricePerKg;
		chickenFilletsFinalPricePerKg = chickenFilletsPricePerKg
				- (chickenFilletsPricePerKg * chickenFilletsDiscountPercentage / 100);
		
		float bananaPricePerKg = 3.25f;
		float bananaDiscountPercentage = 3.0f;
		float bananaFinalPricePerKg;
		bananaFinalPricePerKg = bananaPricePerKg
				- (bananaPricePerKg * bananaDiscountPercentage / 100);
		System.out.println("--------------------------------------------------------------------------");
		System.out.printf("%-20s %-15s %-25s %-15s \n","Product","Price(Kg)","Discount Percentage(%)","Final Price");
		System.out.println("--------------------------------------------------------------------------");
		System.out.printf("%-20s %-15.2f %-25.2f %-15.2f \n", "Apple",applePricePerKg,appleDiscountPercentage,appleFinalPricePerKg);
		
		System.out.printf("%-20s %-15.2f %-25.2f %-15.2f \n", "Chicken Fillets",chickenFilletsPricePerKg,chickenFilletsDiscountPercentage,chickenFilletsFinalPricePerKg);

		System.out.printf("%-20s %-15.2f %-25.2f %-15.2f \n", "Banana",bananaPricePerKg,bananaDiscountPercentage,bananaFinalPricePerKg);

	}

}
