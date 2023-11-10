//Problem Statement 17: You are developing a mathematical game which includes identifying special types of squares. 
//The program should first check whether a rectangle with sides 'a' and 'b' is a square or not. 
//If it is a square, then the program should check whether the square's side length is a perfect square number. 
//If both conditions are met, it should print "Magic
package com.kn.NestedIf;

import java.util.Scanner;

public class SquarePrintMagic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of rectangle : ");
		int a = sc.nextInt();
		System.out.print("Enter breadth : ");
		int b = sc.nextInt();
		isMagic(a,b);
	}

	static void isMagic(int a, int b) {
		if(a==b) {
			int root = (int) Math.sqrt(a);
			if(root*root == a) {
				System.out.println("MAGIC");
			}
		}
	}

}

/*
Enter length of rectangle : 9
Enter breadth : 9
MAGIC

Enter length of rectangle : 2
Enter breadth : 2

 */
