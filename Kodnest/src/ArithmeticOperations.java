import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter both numbers for subtraction");
		System.out.println("Difference of numbers =  " + subtractNumbers(sc.nextInt(),sc.nextInt()));
	
		System.out.println("Enter both numbers for multiply");
		System.out.println("Multiplication of numbers =  " +  multiplyNumbers(sc.nextInt(),sc.nextInt()));
		
		System.out.println("Enter both numbers for Division");
		System.out.println("Division of numbers =  " +  divideNumbers(sc.nextInt(),sc.nextInt()));
		
		System.out.println("Enter both numbers to find remainders");
		System.out.println("Remainder = " +  findRemainder(sc.nextInt(),sc.nextInt()));
	
	}
	public static int subtractNumbers (int num1, int num2) {
		return num1 - num2;
	}
	public static int multiplyNumbers(int num1, int num2) {
		return num2*num1;
	}
	public static double divideNumbers(int num1, int num2) {
		return (double)num1/num2;
	}
	public static int findRemainder(int num1, int num2) {
		return num1%num2;
	}
	
 
}
