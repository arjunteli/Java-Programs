package com.kn.patternProblem;

public class TriangleAlphabet {

	public static void main(String[] args) {
		triangleAlphabet();
	}

	static void triangleAlphabet() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
			
				System.out.print((char)(65+j)+ " ");
				if(i<=j) {
					break;
				}
			}
			System.out.println();
		}	
	}

}
/*

A 
A B 
A B C 
A B C D 
A B C D E 


*/