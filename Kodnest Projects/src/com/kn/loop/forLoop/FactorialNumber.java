package com.kn.loop.forLoop;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		factorialNumber(n);
		sc.close();
	}

	static void factorialNumber(int n) {
		if(n<0) {
			System.out.println("INVALID NUMBER");
			return;
		}
		int fact = 1;
		for(int i = n; i>0; i--) {
			fact = i*fact;
		}
		System.out.println("Factorial of "+n+" is "+fact);
	}

}
