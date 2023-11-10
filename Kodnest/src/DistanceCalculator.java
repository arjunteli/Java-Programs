import java.util.Scanner;

public class DistanceCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JourneyCalculator d1 = new JourneyCalculator();
		System.out.println("Distance = "+ d1.calculateDistance(sc.nextDouble(),sc.nextDouble()) + " Km/h");
	}

}
