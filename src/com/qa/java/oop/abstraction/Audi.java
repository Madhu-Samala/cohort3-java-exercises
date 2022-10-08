package com.qa.java.oop.abstraction;

public class Audi extends Car {
	
	String model;
	boolean isEVAvailable;
	
	
	public Audi(int id, String name, double price, int engineCC, String fuelType, int manufacturingYear, String model,
			boolean isEVAvailable) {
		super(id, name, price, engineCC, fuelType, manufacturingYear);
		this.model = model;
		this.isEVAvailable = isEVAvailable;
	}	
	
	@Override
	void displayCarDetails() {
		System.out.printf("%-10d %-20s %-10.2f %-10d %-10s %-20d %-15s %-15s \n",id,name,price,engineCC,fuelType,manufacturingYear,model,isEVAvailable);
	}

	
	

}
