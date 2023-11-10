package com.kn.whileLoop;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		countDigit(n); 
		
	}

    static void countDigit(int n) {
    	int count = 0;
		while(n>0) {
			count += n%10;
			n/=10;
		}
		System.out.println("Count of digits : "+ count);
	}

}
