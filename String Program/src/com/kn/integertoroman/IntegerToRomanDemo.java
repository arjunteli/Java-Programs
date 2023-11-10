package com.kn.integertoroman;

import java.util.Scanner;

public class IntegerToRomanDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Input From User
		System.out.print("Enter Number = ");
		int num = sc.nextInt();
		
		//Object Creation 
		IntegerToRoman object = new IntegerToRoman();
		System.out.println(object.integerToRoman(num));
	}

}
