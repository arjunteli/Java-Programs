package com.kn.ifElse;

import java.util.Scanner;

public class MultipleOf5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		multiplyOf5(n);
	}

	static void multiplyOf5(int n) {
		if(n%5 == 0) {
			System.out.println(n+ " is multiple of 5 ");
		}else {
			System.out.println(n +" is not a multiple of 5");
		}
	}
}

/*
Enter number : 10
10 is multiple of 5 

*/
 