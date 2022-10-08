package com.qa.java.oop.polymorphism;

public class Main {

	public static void main(String[] args) {
		Car car = new Car(111, "Rolls-Royce Ghost", 466350, 6749, "Petrol", 2022);

		Audi audi = new Audi(111, "Audi A8", 116900, 3528, "Petrol", 2021, "Sedan", false);

		BMW bmw = new BMW(111, "BMW X7", 110900, 2980, "Petrol", 2021, 6, 6000);
		
		CarService carService = new CarService();
		carService.displayCarDetails(car); // will display Car's displayCarDetails
		carService.displayCarDetails(audi); // will display Audi's displayCarDetails
		carService.displayCarDetails(bmw); // will display BMW's displayCarDetails

	}

}
