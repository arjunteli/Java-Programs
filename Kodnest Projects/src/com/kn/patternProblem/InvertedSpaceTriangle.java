package com.kn.patternProblem;

public class InvertedSpaceTriangle {

	public static void main(String[] args) {
		invertedSpaceTriangle();
	}

	private static void invertedSpaceTriangle() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i > j) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
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
