package com.kn.switchCase;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Arjun Vening Machine\n ");
		System.out.println("The product codes are\n 1 for Coke\n 2 for Pepsi\n 3 for Water\n 4 for Juice\n 5 for Tea");
		System.out.print("Enter code for the required product : ");
		int code = sc.nextInt();
		processing(code);
		sc.close();
	}

	static void processing(int code) {
		switch(code) {
		case 1 : System.out.println("Coke will be delivered");
		break;
		case 2 : System.out.println("Pepsi will be delivered");
		break;
		case 3 : System.out.println("Water will be delivered");
		break;
		case 4 : System.out.println("Juice will be delivered");
		break;
		case 5 : System.out.println("Tea will be delivered");
		break;
		default : System.out.println("INVALID CODE ENTERED");
		}
	}

} 
