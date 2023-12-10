package com.kn.stringarray;

public class IsStringPalindrome {
	//Method to check is Palindrome
	public boolean isPalindrome(String inputString) {
		StringBuffer reversedString = new StringBuffer();
		for(int i = inputString.length()-1; i>= 0; i--) {
			reversedString = reversedString.append(inputString.charAt(i));   
		}
		return reversedString.toString().equals(inputString);
	}
}
