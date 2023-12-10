package com.kn.reveresewordofstring;

import java.util.Scanner;

public class ReverseStringWordDemo {
	public static void main(String[] args) {
		//Take input from from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String = :");
		String inputString = sc.nextLine();
		
		//Object Creation
		ReverseStringWord reverse = new ReverseStringWord();
		System.out.println("Reverse words = "+ reverse.reverseString(inputString));
		
		//Release Resources
		sc.close();
	}

}
