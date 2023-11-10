package com.kn.whileLoop;

import java.util.Scanner;

public class HarmonicSeriesSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		harmonicSeriesSum(n);
	}

	static void harmonicSeriesSum(int n) {
		if(n==0) {
			System.out.println("Invalid Number");
			return;
		}
		double sum = 0;
		while(n>0) {
			float i =(float) 1/n;
			sum += i;
			n--;
		}
		System.out.println(sum);
		
	}

}
