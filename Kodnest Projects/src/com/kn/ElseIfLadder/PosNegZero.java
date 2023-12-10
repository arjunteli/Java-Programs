package com.kn.ElseIfLadder;

import java.util.Scanner;

public class PosNegZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		isPositive(n);
	}

	static void isPositive(int n) {
		if(n<0) {
			System.out.println(n + " is negative number");
		}else if(n>0) {
			System.out.println(n+ " is positive number");
		}else {
			System.out.println(n + " is zero");
		}
	}

}

/* 
Enter Number :
-45
-45 is negative number


Enter Number : 
89
89 is positive number

*/ 
 
