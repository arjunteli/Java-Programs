package com.kn.reversestringkeepspacepositionsame;

import java.util.Scanner;


public class RevereseStringKeepingSpaceSameDemo {
	public static void main(String[] args) {
		//input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String = ");
		String inputString = sc.nextLine();
		//Object Creation
		RevereseStringKeepingSpaceSame object = new RevereseStringKeepingSpaceSame();
		
		//Method Calling and Printing String
		System.out.println("Enter String = "+object.revereseStringKeepingSpaceSame(inputString));
		
		//Close Resources
		sc.close();
	}
}
