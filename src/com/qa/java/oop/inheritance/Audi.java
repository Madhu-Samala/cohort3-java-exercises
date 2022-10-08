package com.qa.java.oop.inheritance;

public class Audi extends Car {
	
	String model;
	boolean isEVAvailable;
	
	/*
	 * 1.7 Arg constructor
	 */
	public Audi(int id, String name, double price, int engineCC, String fuelType, int manufacturingYear, String model,
			boolean isEVAvailable) {
		super(id, name, price, engineCC, fuelType, manufacturingYear);
		this.model = model;
		this.isEVAvailable = isEVAvailable;
	}	
	
	/*
	 * 1.4 display car details in Audi
	 */
	void displayCarDetails() {
		System.out.printf("%-10d %-20s %-10.2f %-10d %-10s %-20d %-15s %-15s \n",id,name,price,engineCC,fuelType,manufacturingYear,model,isEVAvailable);
	}

	
	

}
