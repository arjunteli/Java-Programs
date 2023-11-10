package com.kn.patternProblem;

public class ColumnNumbers {

	public static void main(String[] args) {
		columnNumber();
		System.out.println();
		rowNumbers();
	}

	static void columnNumber() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<6; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	static void rowNumbers() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<6; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
/*

1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 

1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5 

*/
