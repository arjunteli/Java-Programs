package com.kn.longestwordinstring;

import java.util.Scanner;

public class LongestInStringDemo {

	public static void main(String[] args) {
		
		//Take input from from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String = ");
		//String inputString = sc.nextLine();
		
		//Object Creation
		LongestWordInString longest = new LongestWordInString();
		
		//Method Call and Print Longest Word String
		System.out.println("Longest Word in String = "+ longest.longestWordInString(sc.nextLine()));
		
		//Release external sources
		sc.close();
		
		
	}
}
