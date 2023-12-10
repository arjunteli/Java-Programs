//2. Given a wrap to take a number as a input and determine whether it is a positive or negative.
import java.util.Scanner;
public class PositiveNegativeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num < 0) {
			System.out.println(num + " is a negative number");
		}
		if(num>=0) {
			System.out.println(num+ " is a positive number");
		}
		sc.close();
	}
}
