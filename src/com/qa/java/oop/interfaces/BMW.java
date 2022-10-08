package com.qa.java.oop.interfaces;

public class BMW extends CarProperties implements Car {
		
	int noOfCylinders;
	int maxTorque;
	
	
	
	public BMW(int id, String name, double price, int engineCC, String fuelType, int manufacturingYear,
			int noOfCylinders, int maxTorque) {
		super(id, name, price, engineCC, fuelType, manufacturingYear);
		this.noOfCylinders = noOfCylinders;
		this.maxTorque = maxTorque;
	}



	@Override
	public void displayCarDetails() {
		System.out.printf("%-10d %-20s %-10.2f %-10d %-10s %-20d %-15d %-15d",id,name,price,engineCC,fuelType,manufacturingYear,noOfCylinders,maxTorque);// TODO Auto-generated method stub
		
	}


	

}
