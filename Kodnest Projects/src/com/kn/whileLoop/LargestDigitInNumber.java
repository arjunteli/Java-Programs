package com.kn.whileLoop;

import java.util.Scanner;

public class LargestDigitInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		largestDigit(n);

}

	static void largestDigit(int n) {
		int maxDigit = n%10;
		int ld ;
		while(n>0) {
			ld = n%10;
			if(maxDigit<ld) {
				maxDigit = ld;
			}
			n/=10;
		}
		System.out.print( "Largest Digit : "+   maxDigit);
	}
}