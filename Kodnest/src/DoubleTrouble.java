import java.util.Scanner;

public class DoubleTrouble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		System.out.println("Double of the number = "+ doubleTrouble(sc.nextInt()));
		
	}
	public static int doubleTrouble(int num) {
		return 2*num;
	}
}
