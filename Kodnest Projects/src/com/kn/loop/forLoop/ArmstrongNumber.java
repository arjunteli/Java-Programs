package com.kn.loop.forLoop;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		if(isArmstrongNumber(n)) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("NOT Armstrong Number");
		}

	}

	static boolean isArmstrongNumber(int n) {
		int temp = n; int sum = 0;
		while(n>0) {
			int d = n%10;
			sum += d*d*d;
			n = n/10;
		}
		if(temp == sum) {
			return true;
		}
		return false;
	}

}

/*
Enter number : 153
Armstrong Number

 *  
 */

