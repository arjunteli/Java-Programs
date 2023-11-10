//7. Write a program to print the product of digits of a number. 

package com.kn.whileLoop;

import java.util.Scanner;

public class ProductsOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		productOfDigits(n);
		
	}

	static void productOfDigits(int n) {
		if(n<0) {
			System.out.println("Enter Positive NUMBER");
			return;
		}
		
		 int product = 1;
		 while(n>0) {
			 if(n%10 == 0) {//OPTIMISED CONDITION
				 product *= n%10;
				 System.out.println("Product = " + product);
				 return;

			 }
			 product *= n%10;
			 n/=10;
		 }
		 System.out.println("Product = " + product);
	}

}
