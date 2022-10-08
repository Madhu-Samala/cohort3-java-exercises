package com.qa.java.fundamentals;

public class ReverseOfNumber {

	public static void main(String[] args) {

			int number = 456456;
			int reverseNumber = 0;
			int temp = number;
			while(temp > 0) {
				reverseNumber = reverseNumber * 10 + temp % 10;
				temp /= 10;
			}
			System.out.println("The reverse of : " + number + " is :" + reverseNumber);
	}

}
