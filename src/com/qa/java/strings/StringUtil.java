package com.qa.java.strings;

public class StringUtil {
	
	/*
	 * 1. Count number of words in a given String
	 */
	static int countWordsInString(String str) {
		return str.split(" ").length;
	}
	
	/*
	 * 2. Email validation 
	 */
	
	static boolean isValidEmail(String email) {
		String regEx = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";
		return email.matches(regEx);
	}

}
