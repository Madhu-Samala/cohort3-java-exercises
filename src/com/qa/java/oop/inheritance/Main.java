package com.qa.java.oop.inheritance;

public class Main {
	
	public static void main(String[] args) {
		Car car = new Car(111, "Rolls-Royce Ghost",466350, 6749, "Petrol", 2022);
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.printf("%-10s %-20s %-10s %-10s %-10s %-20s \n","ID","NAME","PRICE","ENGINE CC","FUEL TYPE","MANUFACTURING YEAR");
		System.out.println("--------------------------------------------------------------------------------------");
		car.displayCarDetails();
		
		Audi audi = new Audi(111,"Audi A8",116900,3528,"Petrol",2021,"Sedan",false);
		System.out.println("---------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%-10s %-20s %-10s %-10s %-10s %-20s %-15s %-15s \n","ID","NAME","PRICE","ENGINE CC","FUEL TYPE","MANUFACTURING YEAR","MODEL","IS EV AVAILABLE");
		System.out.println("---------------------------------------------------------------------------------------------------------------------");
		
		audi.displayCarDetails();
		
		BMW bmw = new BMW(111,"BMW X7",110900,2980,"Petrol",2021,6,6000);
		System.out.println("---------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%-10s %-20s %-10s %-10s %-10s %-20s %-15s %-15s \n","ID","NAME","PRICE","ENGINE CC","FUEL TYPE","MANUFACTURING YEAR","NO OF CYLINDERS","MAX TORQUE");
		System.out.println("---------------------------------------------------------------------------------------------------------------------");
		
		bmw.displayCarDetails();
		
		
	}

}
