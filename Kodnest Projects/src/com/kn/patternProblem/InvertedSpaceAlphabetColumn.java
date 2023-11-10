package com.kn.patternProblem;

public class InvertedSpaceAlphabetColumn {

	public static void main(String[] args) {
		invertedSpaceAlphabetColumn();
		
	}

	static void invertedSpaceAlphabetColumn() {
		for(int i =0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if( i<=j ) {
					System.out.print( (char)(69-j) + " "  );
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


E D C B A 
  D C B A 
    C B A 
      B A 
        A 

*/

