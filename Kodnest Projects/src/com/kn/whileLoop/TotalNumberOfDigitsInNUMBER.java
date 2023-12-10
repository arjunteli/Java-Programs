//1. Write a program to find the number of digits in a number.

package com.kn.whileLoop;

import java.util.Scanner;

public class TotalNumberOfDigitsInNUMBER {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		if(n<0) {
			n = -n;
		}
		int count = numberOfDigits(n);
		System.out.println( "Total Number of digits in "+n+ " = "+count);
		sc.close();
		
		
	}

	static int numberOfDigits(int n) {
		if(n==0) {
			return 1;
		}
		int count = 0;
		while(n>0) {
			count++;
			n /= 10;
		}
		return count;
	}

}
/*
Enter Number : 123456
Total Number of digits in 123456 = 6
 
 * */
