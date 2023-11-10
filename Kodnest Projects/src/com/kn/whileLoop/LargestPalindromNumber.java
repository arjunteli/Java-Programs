//8. Write a program to find the largest number less than a given number which is a palindrome.

package com.kn.whileLoop;

import java.util.Scanner;

public class LargestPalindromNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		largestPalindromeNumber(n);
		
	}
	static void largestPalindromeNumber(int n) {
		int palindrome = 0;
		while(n>0) {
			if(isPalindrome(n)) {
				palindrome = n;
				break;
			}
			n--;
		}
		System.out.println( " Largest Palindrom : "+ palindrome);
	}
	static boolean isPalindrome(int n) {
		int reverse = 0; int temp = n;
		while(n>0) {
			int lastDigit = n%10;//taking last digit
			reverse = reverse*10 + lastDigit;//adding it to reverse number  
			n/=10;
		}
		if(reverse==temp) {
			return true;
		}
		return false;
	}

}
