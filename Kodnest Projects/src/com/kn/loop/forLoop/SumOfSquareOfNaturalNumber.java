//12. Write a program to print the sum of squares of n numbers.
package com.kn.loop.forLoop;

import java.util.Scanner;

public class SumOfSquareOfNaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		printSquareSum(n);
	}

	static void printSquareSum(int n) {
		int sum = 0;
		for(int i = 1; i<=n; i++) {
			
			int square = i*i;
			sum += square;
			
		}
		System.out.print("Sum = "+sum );
	}

}
