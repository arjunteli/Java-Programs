package com.kn.switchCase;

import java.util.Scanner;

public class SpecialDish {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Week Day Number for Special Dish: ");
		int num = sc.nextInt();
		specialDish(num);
		sc.close();
	}

	private static void specialDish(int num) {
		switch(num ) {
		case 1 : System.out.println("MONDAY's Special Dish is Pasta");
		break;
		case 2 : System.out.println("TUESDAY's Special Dish is Tacos ");
		break;
		case 3 : System.out.println("WEDNESDAY's Special Dish is Sushi");
		break;
		case 4 : System.out.println("THURSDAY's Special Dish is Steak ");
		break;
		case 5 : System.out.println("FRIDAY's Special Dish is Pizza");
		break;
		case 6 : System.out.println("SATURDAY's Special Dish is Lobster");
		break; 
		case 7 : System.out.println("SUNDAY's Special Dish is Brunch");
		break;
		default : System.out.println("INVALID NUMBER ");
		}
	}

}
 /*
 Enter Week Day Number for Special Dish: 2
TUESDAY's Special Dish is Tacos 

Enter Week Day Number for Special Dish: 1
MONDAY's Special Dish is Pasta

Enter Week Day Number for Special Dish: 5
FRIDAY's Special Dish is Pizza



  */
  