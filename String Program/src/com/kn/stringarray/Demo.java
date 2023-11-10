package com.kn.stringarray;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array = ");
		int size = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " + (i + 1) + " String");
			arr[i] = sc.nextLine();
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				 if (arr[i].equals(arr[j])) {
					System.out.println(arr[j]);
					break;
				}
			}
		}

		sc.close();
	}
}
