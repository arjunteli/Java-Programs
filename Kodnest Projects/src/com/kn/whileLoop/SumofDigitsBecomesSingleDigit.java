package com.kn.whileLoop;

import java.util.Scanner;

public class SumofDigitsBecomesSingleDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		int ans = sumSingleDigit(n);
		System.out.println(ans);
		sc.close();
	}

	static int sumSingleDigit(int n) { //for final returning a single digit as a sum
		while(n>9) {    // condition until sum becomes single digit num
			n = digitSum(n);
		}
		
		return n;
	}

	static int digitSum(int n) {//for sum of digits
		int sum = 0;
		while(n>0) {
			sum += n%10;
			n /= 10;
		}
		return sum;
	}

}
