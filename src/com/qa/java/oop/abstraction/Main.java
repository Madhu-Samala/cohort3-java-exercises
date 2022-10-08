package com.qa.java.oop.abstraction;

public class Main {

	public static void main(String[] args) {

		Audi audi = new Audi(111, "Audi A8", 116900, 3528, "Petrol", 2021, "Sedan", false);

		BMW bmw = new BMW(111, "BMW X7", 110900, 2980, "Petrol", 2021, 6, 6000);
		
		CarService carService = new CarService();
		carService.displayCarDetails(audi); // will display Audi's displayCarDetails
		carService.displayCarDetails(bmw); // will display BMW's displayCarDetails

	}

}
