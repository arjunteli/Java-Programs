package com.kn.whileLoop;

import java.util.Scanner;

public class BinaryNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		int binary = binaryNum(n);
		System.out.println(binary);
		sc.close();
	}

	static int binaryNum(int n) {
		int bNum = 0;
		int pNum = 1;
		while(n>0) {
			bNum += pNum*(n%2);
			pNum *= 10;
			n /= 2;
		}
		return bNum;
	}

}
