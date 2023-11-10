package com.kn.switchCase;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month's number : ");
		int i = sc.nextInt();
		printMonthName(i);
		sc.close();
	}

	public static void printMonthName(int i) {
		switch (i) {
		case 1 : System.out.println("JANUARY");
		break;
		case 2 : System.out.println("FEBRUARY");
		break;
		case 3 : System.out.println("MARCH");
		break;
		case 4 : System.out.println("APRIL");
		break;
		case 5 : System.out.println("MAY");
		break;
		case 6 : System.out.println("JUNE");
		break;
		case 7 : System.out.println("JULY");
		break;
		case 8 : System.out.println("AUGUST");
		break;
		case 9 : System.out.println("SEPTEMBER");
		break;
		case 10 : System.out.println("OCTOBER");
		break;
		case 11 : System.out.println("NOVEMBER");
		break;
		case 12 : System.out.println("DECEMBER");
		break;
		default : System.out.println("INVALID Month's NUMBER");
		
		}
	}

}

/*
 Enter the month's number : 
4
APRIL

Enter the month's number : 
4
APRIL


*/