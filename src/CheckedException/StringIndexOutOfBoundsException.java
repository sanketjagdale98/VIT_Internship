package CheckedException;

public class StringIndexOutOfBoundsException {

	public static void main(String[] args) {
		
		String str = "Sagar";
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(6));
	}
//	 Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 6


}
