package com.kn.simpleIf;

import java.util.Scanner;

public class PositiveNegativeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		isPositive(num);
		sc.close();
	}

	static void isPositive(int num) {
		
		if(num>0) {
			System.out.println("Positive number - processing...");
		}

	}

}

/*
Enter number : 23
Positive number - processing...

 * */
