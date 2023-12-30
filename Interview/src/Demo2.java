
public class Demo2 {

	public static void main(String[] args) {
		String str = "Hi my   name is 67*& and I love34$$$% my 678";
		str = str.replaceAll("[^  A-Z a-z0-7]", "");
		System.out.println(str);
	}

}
 