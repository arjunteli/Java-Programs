package com.kn.switchCase;

import java.util.Scanner;

public class LibraryManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number for Genre between 1 to 5 : ");
		int num = sc.nextInt();
		genre(num);
		sc.close();
	}

	static void genre(int num) {
		switch(num) {
		case 1 : System.out.println("Fiction");
		break;
		case 2 : System.out.println("Non-Fiction");
		break;
		case 3 : System.out.println("Fantacy");
		break;
		case 4 : System.out.println("Mistery");
		break;
		case 5 : System.out.println("Biography");
		break;
		}
	}

}

/*
Enter the number for Genre between 1 to 5 : 3
Fantacy

Enter the number for Genre between 1 to 5 : 5
Biography


 * */
