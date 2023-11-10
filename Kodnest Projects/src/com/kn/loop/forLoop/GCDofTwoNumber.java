package com.kn.loop.forLoop;

import java.util.Scanner;

public class GCDofTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		int n1 = sc.nextInt();
		System.out.print("Enter num2 : ");
		int n2 = sc.nextInt();
		int gcd = gCD(n1,n2);
		System.out.println("GCD of "+ n1 +","+ n2 +" = "+ gcd);
		sc.close();
	}

	private static int gCD(int n1,int n2) {
		int range = Math.min(n1, n2);
		int gcd = 1;
		for(int i = 2; i<=range;i++) {
			
			if( n1%i==0 && n2%i==0 ) {
				gcd = i;
			}
		}
		return gcd;
		
	}

}

/*
Enter n1 : 2
Enter n2 : 4
GCD of 2 & 4 is 2

 * */
