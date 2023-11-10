import java.util.*;
public class Difference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of numbers");
		System.out.print("a = ");
		int a = sc.nextInt();
		System.out.print("b = ");
		int b = sc.nextInt();
		if(a>b) {
			System.out.println("Difference is  "+ (a-b));
		}
		if(a<b) {
			System.out.println("Difference is  "+ (b-a));
		}
		if(a==b) {
			System.out.println("Difference = "+ (a-b));
		}
	}

}