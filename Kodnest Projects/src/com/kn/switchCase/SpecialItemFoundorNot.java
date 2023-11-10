package com.kn.switchCase;

import java.util.Scanner;

public class SpecialItemFoundorNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numbers of Gold Coins : ");
		int coins = sc.nextInt();
		System.out.print("Enter your level : ");
		int level = sc.nextInt();
		System.out.print("Do you have special key (true/false) : ");
		boolean key = sc.nextBoolean();
		isSpecialItemFound(coins,level,key);
		sc.close();
	}

	static void isSpecialItemFound(int coins, int level, boolean key) {
		switch (coins) {
		case 0 : System.out.println("Better Luck Next Time!!!!!");
		break;
		case 1 : System.out.println("Better Luck Next Time!!!!!");
		break;
		case 2 : System.out.println("Better Luck Next Time!!!!!");
		break;
		case 3 : System.out.println("Better Luck Next Time!!!!!");
		break;
		case 4 : System.out.println("Better Luck Next Time!!!!!");
		break;
		case 5 : System.out.println("Better Luck Next Time!!!!!");
		break;
		case 6 : System.out.println("Better Luck Next Time!!!!!");
		break;
		case 7 : System.out.println("Better Luck Next Time!!!!!");
		break;
		case 8 : System.out.println("Better Luck Next Time!!!!!");
		break;
		case 9 : System.out.println("Better Luck Next Time!!!!!");
		break;
		case 10 : System.out.println("Better Luck Next Time!!!!!");
		break;
		default:if(level>5) {
					if(key) {
						System.out.println("Special Item Found");
					}else {
						System.out.println("Better Luck Next Time!!!!!");
					}
				}
		}
	}
}

/*
Enter the numbers of Gold Coins : 12
Enter your level : 6
Do you have special key (true/false) : true
Special Item Found

Enter the numbers of Gold Coins : 8
Enter your level : 7
Do you have special key (true/false) : true
Better Luck Next Time!!!!!


 * */
