package com.kn.arrayDataStructure;

import java.util.Scanner;

public class IndexOfNumberInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Array Declaration & Creation
		System.out.print("Enter the size of Array : ");
		int size =sc.nextInt();
		int[] arr = new int[size];
		
		//Initialization
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the number : ");
		int num = sc.nextInt();		
		
		int idx = indexOfNumber(arr,num);
		System.err.println("Index of "+ num +" is "+ idx);
		sc.close();

	}

	public static int indexOfNumber(int[] arr, int num) {
		int idx = -1;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==num) {
				idx = i;
			}
		}
		return idx;
	}

}
