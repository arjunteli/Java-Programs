import java.util.*;
public class Election {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age in years : ");
		float age = sc.nextFloat();
		if(age>=18) {
			System.out.println("Your are eligible for voting!!");
			System.out.println("Thank you for your contribution in world's largest democracy.");
		}
		
	}

}
