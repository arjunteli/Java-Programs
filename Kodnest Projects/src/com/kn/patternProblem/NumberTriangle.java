package com.kn.patternProblem;

public class NumberTriangle {

	public static void main(String[] args) {
		printTriangleNumberColumn();
		System.out.println();
		printTriangleNumberRow();
		
	}

	static void printTriangleNumberRow() {
		for(int i =1; i<=5;i++) {
			for(int j =1; j<=i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	static void printTriangleNumberColumn() {
		for(int i =1; i<=5;i++) {
			for(int j =1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	

}


/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 

 * */
