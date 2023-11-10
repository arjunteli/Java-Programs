package com.kn.ceasercipher;

import java.util.Scanner;

public class CeaserCipherDemo {

	public static void main(String[] args) {
		//Take input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String = ");
		String inputString = sc.nextLine();
		
		System.out.print("Enter number = ");
		int num = sc.nextInt();
		
		//Object Creation 
		CeaserCipher object = new CeaserCipher();
		
		//Method Call
		String ceaserCipherString = object.ceaserCipherString(inputString,num);
		System.out.println("Encrypted String = "+ceaserCipherString);
	}

}
