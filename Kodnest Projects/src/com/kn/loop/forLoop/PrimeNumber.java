package com.kn.loop.forLoop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		System.out.println("Prime Numbers are : ");
		printPrimeNumber(n);
		
		sc.close();
	}

	static void printPrimeNumber(int n) {
		for(int i=2; i<=n; i++) {
			boolean prime = isPrime2(i);
			if(prime) {
				System.out.println(i+ " ");
			}
		}
		
	}

	static boolean isPrime(int n) {
		if(n<=1) return false;
		for(int i = 2; i <=n/2; i++) {//optimised 
			if( n%i == 0 ) {
				return false;
			}
		}
		return true;
	}
	static boolean isPrime2(int n) {
		if(n<=1) return false;
		int count = 0;
		for(int i = 1; i <=n/2 ; i++) {//optimised 
			if( n%i == 0 ) {
				count ++;
			}
		}
		if(count == 1) {
			return true;
		}else {
			return false;
		}
	}

}
