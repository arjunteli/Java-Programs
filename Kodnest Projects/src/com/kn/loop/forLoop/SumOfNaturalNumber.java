package com.kn.loop.forLoop;

import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		printNaturalNUmber(n);
		sc.close();
	}

	static void printNaturalNUmber(int n) {
		int ans = 0;
		for(int i = n;i>0;i--) {
			ans +=i;
		}
		System.out.println("Sum of first "+n+" natural number is "+ans);
	}

}
/*
Enter Number : 5
Sum of first 5 natural number is 15

 * */
 