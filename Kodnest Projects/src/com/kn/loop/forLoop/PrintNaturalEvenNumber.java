package com.kn.loop.forLoop;

import java.util.Scanner;

public class PrintNaturalEvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		printNaturalEvenNumber(n);
	}

	static void printNaturalEvenNumber(int n) {
		System.out.println("Natural Number are : ");
		for(int i = 1; i<=n; i++) {
			if(i%2 == 0) {
				System.out.print(i + " ");
			}else {
				
			}
		}
	}

}
