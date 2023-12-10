package com.kn.patternProblem;

public class InvertedTriangle {

	public static void main(String[] args) {
		invertedTriangle();
	}

	static void invertedTriangle() {
		for(int i = 0; i<5; i++) {
			for(int j = 0; j < 5-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
/*

* * * * * 
* * * * 
* * * 
* * 
* 
 
*/
