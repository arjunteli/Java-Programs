package com.kn.arrayDataStructure;

import java.util.Scanner;

public class DuplicateNumberIN2DArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of row :- ");
		int[][] arr1 = new int[sc.nextInt()][];
		int[][] arr2 = new int[arr1.length][];
		
		for(int i = 0; i<arr1.length; i++) {
			System.out.print("Enter column size of "+(i+1) + " row : ");
			arr1[i] = new int[sc.nextInt()];
			arr2[i] = new int[arr1[i].length];
		}
		
		System.out.println("Enter numbers of Array 1 = ");
		for(int i = 0; i<arr1.length; i++) {
			System.out.println("Row " + (i+1) +" :-" );
			for(int j = 0; j<arr1[i].length; j++) {
				System.out.print( "        Column " + (j+1)+ " = ");
				arr1[i][j] = sc.nextInt();
				System.out.println();
			}
		}
		
		System.out.println("Enter numbers of Array 2 = ");
		for(int i = 0; i<arr1.length; i++) {
			System.out.println("Row " + (i+1) +" :-" );
			for(int j = 0; j<arr1[i].length; j++) {
				System.out.print( "        Column " + (j+1)+ " = ");
				arr2[i][j] = sc.nextInt();
				System.out.println();
			}
		}
		sumElement(arr1,arr2);
		
		
	}

	public static void sumElement(int[][] arr1, int[][] arr2) {
		int arr3 [][] = new int[arr1.length][];
		for(int i = 0; i<arr1.length; i++) {
			arr3[i] = new int[arr1[i].length];
			for(int j = 0; j<arr1[i].length;j++) {
				arr3[i][j] = arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("Sum of elements of Both Arrays are := ");
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr1[i].length;j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
