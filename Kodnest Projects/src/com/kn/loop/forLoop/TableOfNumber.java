package com.kn.loop.forLoop;

import java.util.Scanner;

public class TableOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		System.out.println("Table of "+ n + " is : ");
		Table(n);
		sc.close();
	}

	static void Table(int n) {
		for(int i = 1; i<=10; i++) {
			System.out.println(n+" * "+i+" = "+ (n*i));
		}
	}

}
