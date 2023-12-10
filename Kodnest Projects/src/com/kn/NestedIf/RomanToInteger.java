package com.kn.NestedIf;

import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Roman Number : ");
		String str = sc.next();
		romanToInteger(str);
		sc.close();
	}

	static void romanToInteger(String str) {
		if(str.equalsIgnoreCase("i")) {
			System.out.print("Integer number of "+ str+ " is ");
			System.out.println("1");
		}else if(str.equalsIgnoreCase("ii")) {
			System.out.print("Integer number of "+ str+ " is ");
			System.out.println("2");
		}else if(str.equalsIgnoreCase("iii")) {
			System.out.print("Integer number of "+ str+ " is ");
			System.out.println("3");
		}else if(str.equalsIgnoreCase("iv")) {
			System.out.print("Integer number of "+ str+ " is ");
			System.out.println("4");
		}else if(str.equalsIgnoreCase("v")) {
			System.out.print("Integer number of "+ str+ " is ");
			System.out.println("5");
		}else {
			
		}
	}

}

/*
 Enter Roman Number : I
Integer number of I is 1

Enter Roman Number : IV
Integer number of IV is 4

 */
