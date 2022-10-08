package com.qa.java.arrays;


public class ProductsArray {
	
	public static void main(String[] args) {
		
		Product[] products;
		products = new Product[] {
				new Product(111,"Mac Book Pro",1179.0,"laptop",4.8f,8.3f,true),
				new Product(222,"Mac Book Air",2739.0,"laptop",4.9f,5.8f,false),
				new Product(333,"Mac Book Air M1",2689.0,"laptop",4.4f,6.8f,true),
				new Product(444,"Mac iPad Pro",899.0,"ipad",4.8f,3.5f,true),
				new Product(555,"Mac iPad Air",699.0,"ipad",4.7f,6.5f,true)
		};
		
		System.out.println("Product with least price : " + ArrayUtil.productWithLeastPrice(products).name);
		System.out.println("Product with highest price : " + ArrayUtil.productWithHighestPrice(products).name);
		System.out.println("Product with higest rating : " + ArrayUtil.productWithHighestRating(products).name);
		
		
	}

}
