package com.qa.java.arrays;

public class ArrayUtil {
	
	/*
	 * Method to calculate sum of array elements
	 */
	static int sumOfArrayElements(int[] nos) {
		int sum = 0;
		for(int no : nos) {
			sum += no;
		}
		return sum;
	}
	
	/*
	 * Method to calculate smallest number in an array
	 */
	static int smallestNumberInArray(int[] nos) {
		int smallestNumber = nos[0];
		for(int no : nos) {
			if( no < smallestNumber) {
				smallestNumber = no;
			}
		}
		return smallestNumber;
	}
	/*
	 * Method to calculate highest number in an array
	 */
	static int highestNumberInArray(int[] nos) {
		int highestNumber = nos[0];
		for(int no : nos) {
			if( no > highestNumber) {
				highestNumber = no;
			}
		}
		return highestNumber;
	}

	/*
	 * 2.a Method to return product with least price
	 */
	static Product productWithLeastPrice(Product[] products) {
		Product product = products[0];
		double leastPrice = products[0].price;
		for(Product prod : products) {
			if(prod.price < leastPrice) {
				product = prod;
				leastPrice = prod.price;
			}
		}		
		return product;
	}
	
	/*
	 * 2.b Method to return product with highest price
	 */
	static Product productWithHighestPrice(Product[] products) {
		Product product = products[0];
		double highestPrice = products[0].price;
		for(Product prod : products) {
			if(prod.price > highestPrice) {
				product = prod;
				highestPrice = prod.price;
			}
		}		
		return product;
	}
	
	/*
	 * 2.a Method to return product with least price
	 */
	static Product productWithHighestRating(Product[] products) {
		Product product = products[0];
		double highestRating = products[0].rating;
		for(Product prod : products) {
			if(prod.price > highestRating) {
				product = prod;
				highestRating = prod.price;
			}
		}		
		return product;
	}
}
