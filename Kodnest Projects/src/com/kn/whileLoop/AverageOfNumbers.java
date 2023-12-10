package com.kn.whileLoop;

import java.util.Scanner;

public class AverageOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total number of Numbers : ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i =0; i<n; i++) {
			sum += sc.nextInt();
		}
		double avg = averageOfNumbers(sum,n);
		System.out.println("Average = "+ avg);

	}

	static double averageOfNumbers(int sum, int n) {
		//double avg =(double) sum/n;
		return (double) sum/n;
	
	}
}