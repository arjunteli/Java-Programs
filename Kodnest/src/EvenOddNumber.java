//1. Write a program to take a number as a input and find out whether it is an even or odd number.
import java.util.Scanner;
public class EvenOddNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println(num + " is a even number");
		}
		if(num%2 != 0) {
			System.out.println(num+ " is a odd number");
		}
		
	}
}
