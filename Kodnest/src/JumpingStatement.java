import java.util.Scanner;

public class JumpingStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		for(int i = 1; i<range; i++) {
			if( i%3 == 0) {
				System.out.println("  >>-- Divisible by 3 <<--");
				break;
			}else {
				System.out.println("Not Divisible");
			}
			System.out.println("Within the body");
		}
	}

}
