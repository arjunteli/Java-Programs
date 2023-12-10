package com.kn.whileLoop;

import java.util.Scanner;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		sumOddNumbers(n);
	}

	static void sumOddNumbers(int n) {
		int sum = 0;
		while (n>0) {
			int i = n%10 ;
			if((i%2) != 0) {
				sum += i ;
			}
			n /= 10;
		}
		System.out.println("sum : " + sum);
	}

}
