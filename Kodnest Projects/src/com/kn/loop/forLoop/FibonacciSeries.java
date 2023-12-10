package com.kn.loop.forLoop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		fibonacciSeries(n);
		sc.close();
	}

	static void fibonacciSeries(int n) {
		if(n<=0) return;
		if(n==1) {
			System.out.print(n-1);
			return;
		}
		if(n==2) {
			System.out.print("0 "+ (n-1));
			return;
		}
		
		int firstNum = 0, secondNum = 1, nextNum;
		System.out.print(firstNum +" "+ secondNum);
		for(int i =3; i<=n; i++) {
			nextNum = firstNum + secondNum;
			System.out.print(" "+nextNum);
			firstNum = secondNum;
			secondNum = nextNum;
		
			
		}
	}

}
