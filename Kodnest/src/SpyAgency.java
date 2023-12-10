import java.util.Scanner;

public class SpyAgency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MessageDecoder md = new MessageDecoder();
		System.out.println("Unicode of the message is "+ md.messageDecode(sc.next().charAt(0)));
		sc.close();
	}

}
