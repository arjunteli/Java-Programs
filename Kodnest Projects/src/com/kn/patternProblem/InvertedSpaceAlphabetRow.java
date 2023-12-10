package com.kn.patternProblem;

public class InvertedSpaceAlphabetRow {

	public static void main(String[] args) {
		invertedSpaceAlphabetRow();
	}

	static void invertedSpaceAlphabetRow() {

		for(int i =0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if( i<=j ) {
					System.out.print( (char)(69-i) + " "  );
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
/*

E E E E E 
  D D D D 
    C C C 
      B B 
        A 

*/
