package com.qa.java.oop.inheritance;

public class Car {
	
	int id;
	String name;
	double price;
	int engineCC;
	String fuelType;
	int manufacturingYear;
	
	/*
	 * 1.7 Arg Constructor
	 */
	
	public Car(int id, String name, double price, int engineCC, String fuelType, int manufacturingYear) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.engineCC = engineCC;
		this.fuelType = fuelType;
		this.manufacturingYear = manufacturingYear;
	}
	
	/*
	 * 1.2 Display the car details
	 */
	void displayCarDetails() {
		System.out.printf("%-10d %-20s %-10.2f %-10d %-10s %-20d \n",id,name,price,engineCC,fuelType,manufacturingYear);
	}

	

}
