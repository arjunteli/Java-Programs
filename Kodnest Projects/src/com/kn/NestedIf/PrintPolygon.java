package com.kn.NestedIf;

import java.util.Scanner;

public class PrintPolygon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of sides between 3 to 8 : ");
		int n = sc.nextInt(); 
		printPolygon(n);
		
	}

	static void printPolygon(int n) {
		if(n==3) {
			System.out.println("Triangle");
		}else if(n==4) {
			System.out.println("Quadrilateral");
		}else if(n==5) {
			System.out.println("Pentagon");
		}else if(n==6) {
			System.out.println("Hexagon");
		}else if(n==7) {
			System.out.println("Heptagon");
		}else if (n==8) {
			System.out.println("Octagon");
		}else {
			
		}
	}

}


/*
Enter number of sides between 3 to 8 : 4
Quadrilateral


Enter number of sides between 3 to 8 : 6
Hexagon

*/