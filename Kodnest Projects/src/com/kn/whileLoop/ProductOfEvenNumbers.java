//2. Write a program to calculate the product of first n even numbers.

package com.kn.whileLoop;

import java.util.Scanner;

public class ProductOfEvenNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		int product = productEvenNumbers(n);
		System.out.println(product);
		sc.close();
	}

	static int productEvenNumbers(int n) {
		if(n==0) return 0;
		if(doesNotContainEven(n)) {
			return 0;
		}
		
		int product = 1;
		while(n>0) {
			if(isEven(n%10)) {
				product *= n % 10;
			}
			n/=10;
		}
		return product;
		
	}

	static boolean doesNotContainEven(int n) { //to check the number contains any even digit or not
		if(n==0) {
			return false;
		}
		while(n>0) {
			if(n%2==0) {
				return false;
			}
			n/=10;
		}
		return true;
	}

	static boolean isEven(int n) { //to check a num is even or not
		if(n%2==0) {
			return true;
		}
		return false;
	}

}
