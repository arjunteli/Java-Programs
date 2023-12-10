package com.kn.patternProblem;

public class ColumnAlphabet {
	public static void main(String[] args) {
		columnAlphabet();
		System.out.println();
		rowAlphabet();
		
	}

	static void columnAlphabet() {
		for(int i = 0; i<5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print((char)(65+i) + " ");
			}
			System.out.println();
		}
	}
	
	static void rowAlphabet() {
		for(int i = 0; i<5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print((char)(65+j) + " ");
			}
			System.out.println();
		}
	}
	
	
}

/*
A A A A A 
B B B B B 
C C C C C 
D D D D D 
E E E E E 
 
*/
 