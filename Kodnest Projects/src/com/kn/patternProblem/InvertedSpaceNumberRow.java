package com.kn.patternProblem;

public class InvertedSpaceNumberRow {

	public static void main(String[] args) {
		invertedSpaceNumberRow();
	}

	static void invertedSpaceNumberRow() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i<=j) {
					System.out.print((i+1) + " ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
/*



1 1 1 1 1 
  2 2 2 2 
    3 3 3 
      4 4 
        5
        
         
*/