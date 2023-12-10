package com.kn.patternProblem;

public class InvertedTriangleSpaceSpaceInvertedTriangle {

	public static void main(String[] args) {
		invertedTriangleSpaceSpaceInvertedTriangle();
	}

	static void invertedTriangleSpaceSpaceInvertedTriangle() {
		
			for(int i = 1; i <= 5; i++) {
				for(int j = 1; j <= 9; j++) {
					if((j<=6-i) || (j>=i+4)) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		
	}

}
/*

* * * * * * * * * 
* * * *   * * * * 
* * *       * * * 
* *           * * 
*               * 


*/
