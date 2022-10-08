package com.qa.java.oop.polymorphism;

public class BMW extends Car {
		
	int noOfCylinders;
	int maxTorque;
	
	
	
	public BMW(int id, String name, double price, int engineCC, String fuelType, int manufacturingYear,
			int noOfCylinders, int maxTorque) {
		super(id, name, price, engineCC, fuelType, manufacturingYear);
		this.noOfCylinders = noOfCylinders;
		this.maxTorque = maxTorque;
	}


	/*
	 * Overriding displayCarDetails from Car
	 */
	
	@Override
	void displayCarDetails() {
		System.out.printf("%-10d %-20s %-10.2f %-10d %-10s %-20d %-15d %-15d",id,name,price,engineCC,fuelType,manufacturingYear,noOfCylinders,maxTorque);
	}
	


}
