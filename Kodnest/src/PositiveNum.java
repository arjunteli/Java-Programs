import java.util.Scanner;

public class PositiveNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter the Number = ");
		int n = sc.nextInt();
		if(n>=0) {
			System.out.println("Positive number - processing...");
		}
	}
}
