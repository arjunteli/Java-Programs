package com.kn.NestedIf;

import java.util.Scanner;

public class DigitToWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ; 
		System.out.print("Enter Digit between 0 to 9 : ");
		int digit = sc.nextInt();
		if(digit>=0 && digit<=9) {
			digitToNumber(digit);
		}else {
			System.out.println("Wrong digit is entered");
		}
		sc.close();
	}

	static void digitToNumber(int d) {
		if(d==0) {
			System.out.println("Zero");
		}else if(d==1) {
			System.out.println("One");
		}else if(d==2) {
			System.out.println("Two");
		}else if(d==3) {
			System.out.println("Three");
		}else if(d==4) {
			System.out.println("Four");
		}else if(d==5) {
			System.out.println("Five");
		}else if(d==6) {
			System.out.println("Six");
		}else if(d==7) {
			System.out.println("Seven");
		}else if(d==8) {
			System.out.println("Eight");
		}else if(d==9) {
			System.out.println("Nine");
		}
	}

}

/*
Enter Digit between 0 to 9 : 3
Three

Enter Digit between 0 to 9 : 7
Seven


*/