package com.qa.java.oop.abstraction;

public abstract class Car {
	
	int id;
	String name;
	double price;
	int engineCC;
	String fuelType;
	int manufacturingYear;
	
	
	
	public Car(int id, String name, double price, int engineCC, String fuelType, int manufacturingYear) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.engineCC = engineCC;
		this.fuelType = fuelType;
		this.manufacturingYear = manufacturingYear;
	}
	
	
	abstract void displayCarDetails() ;

	

}
