package CheckedException;

public class NullPointerException {
	
	int i = 10;
	static NullPointerException t;

	public static void main(String[] args) {
		System.out.println(t);
		System.out.println(t.i);
	}
//	Exception in thread "main" java.lang.NullPointerException: Cannot read field "i" because "CheckedException.NullPointerException.t" is null
//	at CheckedException.NullPointerException.main(NullPointerException.java:10)

}
