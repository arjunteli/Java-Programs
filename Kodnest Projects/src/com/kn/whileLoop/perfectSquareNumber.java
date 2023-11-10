//Write a program to print all the perfect numbers between 1 and n.

package com.kn.whileLoop;

import java.util.Scanner;

public class perfectSquareNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		printPerfectSquare(n);
		
	}

	static void printPerfectSquare(int n) {
		int i = 1;
		while(i<=n) {
			int root = (int)Math.sqrt(i);
			if(root*root == i) {
				System.out.println(i + " ");
			}
			i++;
		}
		
	}

}
