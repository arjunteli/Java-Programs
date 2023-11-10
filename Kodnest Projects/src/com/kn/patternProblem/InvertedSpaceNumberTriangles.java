package com.kn.patternProblem;



public class InvertedSpaceNumberTriangles {

	public static void main(String[] args) {
		invertedColumnserial();
		System.out.println();
		invertedRowSeries();
		
		
	}

	static void invertedColumnserial() {
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
	static void invertedRowSeries() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i<=j) {
					System.out.print((j+1) + " ");
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

1 2 3 4 5 
  2 3 4 5 
    3 4 5 
      4 5 
        5 


*/
 
