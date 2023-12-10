//8. Write a program to check whether a number is a Palindrome or not.

package com.kn.loop.forLoop;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		boolean bl =  isPalindrome(n);
		if(bl) {
			System.out.println(n+" is Palindrome Number");
		}else {
			System.out.println(n +" is NOT Palindrome Number");
		}
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
