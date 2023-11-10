//3. Write a program to find the sum of numbers in a range that are divisible by a given number.

package com.kn.whileLoop;

import java.util.Scanner;

public class SumofNumerDivisibleByANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Range : ");
		int r = sc.nextInt();
		System.out.print("Enter Divisor : ");
		int d = sc.nextInt();	
		int sum = sumOfNumbersDivisibleByDivisor(r,d);
		System.out.println("Sum = " + sum);
		sc.close();
	}

	static int sumOfNumbersDivisibleByDivisor(int r, int d) {
		int sum = 0;
		int i = 0;
		while(i<=r) {
			if(i%d==0) {
				sum += i;
			}
			i++;
		}
		return sum;
	}

}

/*
Enter Range : 10
Enter Divisor : 2
Sum = 30

 */
