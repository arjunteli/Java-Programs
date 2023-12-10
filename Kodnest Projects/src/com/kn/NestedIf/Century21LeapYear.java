package com.kn.NestedIf;

import java.util.Scanner;

public class Century21LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year : ");
		int year = sc.nextInt();
		boolean bl = leap(year);
		boolean bl2 = false;
		if(year>=2000 && year<=2099)
			bl2 = true;
		if(bl) {
			if(bl && bl2) {
				System.out.println("21 Century Leap Year");
			}else {
				System.out.println("Leap year");
			}
		}
	}
	public static boolean leap(int year) {
		boolean leap = false;
		
		if(year %4 == 0) {
			if(year%100==0) {
				if(year%400==0) {
					leap = true;
				}
			}else {
				leap = true;
			}
			
		}
		
		return leap;
		
	}

}



/* 
 Enter year : 2024
21 Century Leap Year

Enter year : 1996
Leap year


 */
