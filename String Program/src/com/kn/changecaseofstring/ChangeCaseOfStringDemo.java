package com.kn.changecaseofstring;

import java.util.Scanner;

public class ChangeCaseOfStringDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String = ");
		String inputString = sc.nextLine();
		ChangeCaseOfString updatedString = new ChangeCaseOfString();
		System.out.println("Updated String = "+ updatedString.changeCases(inputString));
	}

}
