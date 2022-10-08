package com.qa.java.oop.polymorphism;

public class Car {
	
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
	
	
	void displayCarDetails() {
		System.out.printf("%-10d %-20s %-10.2f %-10d %-10s %-20d \n",id,name,price,engineCC,fuelType,manufacturingYear);
	}

	

}
