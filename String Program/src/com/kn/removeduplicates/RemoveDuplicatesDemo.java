package com.kn.removeduplicates;

import java.util.Scanner;

public class RemoveDuplicatesDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// take input from user
		System.out.print("Enter string = ");
		String inputString = sc.nextLine();

		// Object Creation
		RemoveDuplicates uniqueString = new RemoveDuplicates();
		// method call
		String str = uniqueString.removeDuplicate(inputString);
		System.out.println("Unique String = " + str);

		// Release resources
		sc.close();
	}

}
