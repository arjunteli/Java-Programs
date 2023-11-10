package com.kn.patternProblem;

public class InvertedRowNumberTriangle {

	public static void main(String[] args) {
		invertedRow();
		System.out.println();
		invertedColumn();
		System.out.println();
		invertedColumnSeriel();
		System.out.println();
		invertedColumnserial();
		
	}

	static void invertedColumnserial() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i+j < 5) {
					System.out.print((5-j) + " ");
				}
			}
			System.out.println();
		}	
	}

	static void invertedColumnSeriel() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i+j < 5) {
					System.out.print((i+1) + " ");
				}
			}
			System.out.println();
		}
	}
	static void invertedColumn() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i+j < 5) {
					System.out.print((1+j) + " ");
				}
			}
			System.out.println();
		}	
	}

	static void invertedRow() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i+j < 5) {
					System.out.print((5-i) + " ");
				}
			}
			System.out.println();

		}
	}
	

}


/*

5 5 5 5 5 
4 4 4 4 
3 3 3 
2 2 
1 

1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

1 1 1 1 1 
2 2 2 2 
3 3 3 
4 4 
5 

5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5 

*/
 