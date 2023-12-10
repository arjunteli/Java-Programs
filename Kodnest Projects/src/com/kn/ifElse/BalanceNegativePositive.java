package com.kn.ifElse;

import java.util.Scanner;

public class BalanceNegativePositive {
	public static void check(int balance) {
		if(balance<0) {
			System.out.println("Negative Balance");
		}else {
			System.out.println("Positive Balance");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter balance details : ");
		int balance = sc.nextInt();
		check(balance);
		sc.close();
		
	}
}
/*
 Enter balance details : 
45
Positive Balance


 */
 