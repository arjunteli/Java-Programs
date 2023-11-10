
public class NestedControlConstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 17;
		if(a>=10) {
			System.out.println("If Body");
			if(a>15) {
				System.out.println("Inner/Nested If Body");
			}else {
				System.out.println("Inner/Nested Else Body");
			}
		}else {
			System.out.println("Else Body");
			if(a>5) {
				System.out.println("Inner else If Body");
			}else {
				System.out.println("Nested Else Else");
			}
		}

	}

}
