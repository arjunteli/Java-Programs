package com.kn.patternProblem;

public class InvertedColumnNumber {

	public static void main(String[] args) {
		invertedColumnNumber();
	}

	static void invertedColumnNumber() {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i + j <= 6) {
					System.out.print((j) + " ");
				}
			}
			System.out.println();
		}
	}

}

/*
 * 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

 * */
 