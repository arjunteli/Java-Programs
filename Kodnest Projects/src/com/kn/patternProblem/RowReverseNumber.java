package com.kn.patternProblem;

public class RowReverseNumber {

	public static void main(String[] args) {
		printRowNumbers();
		
	}

	static void printRowNumbers() {
		for(int i = 5; i>0; i--) {
			for(int j = 5; j>0; j--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}


/*
5 5 5 5 5 
4 4 4 4 4 
3 3 3 3 3 
2 2 2 2 2 
1 1 1 1 1 

 * */
 