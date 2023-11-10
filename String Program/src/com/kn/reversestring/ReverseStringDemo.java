package com.kn.reversestring;

import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) {
		
		//Take input from from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String = ");
		String inputString = sc.nextLine();
		
		//Object Creation
		ReverseString reverseString = new ReverseString();
		
		//Method Calling 
		String output =  reverseString.reverseString(inputString);
		
		//Print Reversed String
		System.out.println("Reversed String = "+ output);
		
		//Close Scanner Class
		sc.close();
	}

}
