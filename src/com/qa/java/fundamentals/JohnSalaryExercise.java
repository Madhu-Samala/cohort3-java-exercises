package com.qa.java.fundamentals;

public class JohnSalaryExercise {

	public static void main(String[] args) {
		/*
		 * John has been working in a company for six years. 
		 * His monthly salary is 35000£. 
		 * Company has increased his salary by 10.5%. 
		 * Calculate and print John's incremented salary and the updated total salary.
		 * 
		 */
		
		float salary = 35000;
		float incrementPercentage = 10.5f;
		float incrementedSalary ;
		incrementedSalary = salary * incrementPercentage / 100;
		System.out.println("John's incremented Salary :" + incrementedSalary);
		
		float totalSalary;
		totalSalary = salary + incrementedSalary;
		System.out.println("John's Total Salary : " + totalSalary);

	}

}
