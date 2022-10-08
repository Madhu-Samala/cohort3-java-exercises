package com.qa.java.oop.inheritance;

public class BMW extends Car {
	
	/*
	 * 1.5 BMW Properties
	 */
	
	int noOfCylinders;
	int maxTorque;
	
	/*
	 * 1.7 Arg Constructors
	 */
	
	public BMW(int id, String name, double price, int engineCC, String fuelType, int manufacturingYear,
			int noOfCylinders, int maxTorque) {
		super(id, name, price, engineCC, fuelType, manufacturingYear);
		this.noOfCylinders = noOfCylinders;
		this.maxTorque = maxTorque;
	}



	/*
	 * 1.6 Display Car Details
	 */
	
	void displayCarDetails() {
		System.out.printf("%-10d %-20s %-10.2f %-10d %-10s %-20d %-15d %-15d",id,name,price,engineCC,fuelType,manufacturingYear,noOfCylinders,maxTorque);
	}
	


}
