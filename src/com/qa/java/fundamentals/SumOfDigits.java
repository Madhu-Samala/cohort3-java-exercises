package com.qa.java.fundamentals;

public class SumOfDigits {

	public static void main(String[] args) {

		int number = 5678;
		int temp = number;
		int sum = 0;
		while (temp > 0) {
			sum += temp % 10;
			temp /= 10;
		}
		System.out.println("Sum of Digits of the Number : " + number + " is : " + sum);
	}

}
