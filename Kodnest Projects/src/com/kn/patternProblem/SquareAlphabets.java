package com.kn.patternProblem;

public class SquareAlphabets {

	public static void main(String[] args) {
		squareAlphabets();
	}

	static void squareAlphabets() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print((char)(69-i) + " ");
			}
			System.out.println();
		}	
	}

}
/*

E E E E E 
D D D D D 
C C C C C 
B B B B B 
A A A A A 

*/