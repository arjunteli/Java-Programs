package com.kn.palindromestring;

import java.util.Scanner;

public class IsStringPalindromeDemo {

	public static void main(String[] args) {
		
		//Take input from from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String = ");
		String inputString = sc.nextLine();
		
		//Object Creation
		IsStringPalindrome isPalindrome = new IsStringPalindrome();
		
		//Method Calling and Print OUTPUT
		if(isPalindrome.isPalindrome(inputString)) {
			System.out.println(inputString + " is Palindrome");
		}else {
			System.out.println(inputString + " is not Palindrome");
		}
		
		//Scanner close
		sc.close();
	}

}
