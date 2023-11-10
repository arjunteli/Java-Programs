//9. Write a program to calculate the sum of digits of a number.

package com.kn.loop.forLoop;

import java.util.Scanner;

public class SumOfDigitOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		printSum(n);
	}

	static void printSum(int n) {
		int sum = 0;int temp = n;
		while(n>0) {
			int lastDigit = n%10;//taking last digit
			sum += lastDigit;//adding to sum
			n/=10;
		}
		System.out.println("Sum of digits of "+ temp +" : "+ sum );
	}

}


/*
Enter number : 12345
Sum of digits of 12345 : 15

 */
