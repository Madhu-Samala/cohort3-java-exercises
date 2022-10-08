package com.qa.java.strings;

public class StringsTest {

	public static void main(String[] args) {

		String sentence = "hello how are you";
		
		String[] emails = { "abc_gmail.com", "abcd*()@gmail.com", "abcd@gmail.com", "test_123@gmail.com", "1234@#$@gmail.com"};
		/*
		 * 2.a Print no of Valid emails
		 */
		int validEmailCount = 0;
		for(String email : emails) {
			if(StringUtil.isValidEmail(email))
				validEmailCount++;
		}
		System.out.println("No of Valid Emails : " + validEmailCount);
		
		/*
		 * 2.b Print No of invalid emails
		 */
		
		int invalidEmailCount = 0;
		for(String email : emails) {
			if(!StringUtil.isValidEmail(email))
				invalidEmailCount++;
		}
		System.out.println("No of Invalid Emails : " + invalidEmailCount);
		
		/*
		 * 2.c Print valid emails
		 */
		System.out.println("Valid Emails");
		for(String email : emails) {
			if(StringUtil.isValidEmail(email))
				System.out.println(email);
		}
		
		/*
		 * 2.d Print Invalid emails
		 */
		System.out.println("Invalid Emails");
		for(String email : emails) {
			if(!StringUtil.isValidEmail(email))
				System.out.println(email);
		}
	}

}
