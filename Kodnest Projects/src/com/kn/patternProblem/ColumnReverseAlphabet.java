package com.kn.patternProblem;

public class ColumnReverseAlphabet {

	public static void main(String[] args) {
		printColumnReverseAlphabet();
		System.out.println();
	}
	static void printColumnReverseAlphabet() {
		for(int i = 5; i>0; i--) {
			for(int j = 5; j > 0; j--) {
				System.out.print((char)(64+j) + " ");
			}
			System.out.println();
		}
	}
	

}
/*
E D C B A 
E D C B A 
E D C B A 
E D C B A 
E D C B A 
 

 */
