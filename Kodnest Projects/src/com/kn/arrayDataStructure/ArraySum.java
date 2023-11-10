package com.kn.arrayDataStructure;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt(); 
		}
		arraySum(arr,size);
		sc.close();

		
	}

	static void arraySum(int[] arr, int size) {
		int sum = 0;
		if(size%2==0) {
			for(int i = 0; i < size/2; i++) {
				sum += (arr[i]+arr[size-i-1]) ;
			}
			System.out.println("Sum of Array : "+ sum);

		}else {
			int i = 0;
			for(; i < size/2; i++) {
				sum += (arr[i]+arr[size-i-1]) ;
			}
			sum += arr[i];
			System.out.println("Sum of Array : "+ sum);

		}
	}

}
