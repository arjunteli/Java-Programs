package com.kn.arrayDataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array = ");
		int arr[] = new int[sc.nextInt()];
		for(int i = 0; i<arr.length; i++) {
			
			arr[i] = sc.nextInt();
		}
		printDuplicate(arr);
	}
	

	public  static void printDuplicate(int[] arr) {
		Arrays.sort(arr);
		for(int i = 0; i<arr.length-1; i++) {
			if(arr[i]==arr[i+1]) {
				System.out.print("Duplicate number = " + arr[i]);
				return;
			}
		}
		System.out.println("NO Duplicate Found !!!!");
	}

}
