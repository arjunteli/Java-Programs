package com.kn.simpleIf;

import java.util.Scanner;

public class CapitalLetterCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Character : ");
		char ch = sc.nextLine().charAt(0);
		sc.close();
		isCapital(ch);
	}

	static void isCapital(char ch) {
		if((int)ch >64 && (int)ch<91) {
			System.out.println("Capital letter detected"); 
		}
	}

}
/*
Enter Character : K
Capital letter detected

Enter Character : h

*/