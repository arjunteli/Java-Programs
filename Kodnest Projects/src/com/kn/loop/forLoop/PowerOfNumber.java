package com.kn.loop.forLoop;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Base : ");
		int num = sc.nextInt();
		System.out.print("Enter Exponent : ");
		int exp = sc.nextInt();
		int power = calcPower(num,exp);
		System.out.println( num+ " to the power "+ exp+ " is "+ power);
	}

	static int calcPower(int num, int exp) {
		if(exp==0) {
			return 1;
		}
		int power = 1;
		for(int i = 1; i<=exp; i++) {
			power *= num;
		}
		return power;
	}

}
