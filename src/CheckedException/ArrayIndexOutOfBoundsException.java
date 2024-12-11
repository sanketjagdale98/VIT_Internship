package CheckedException;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[3]);
		System.out.println(a[5]);
	}
//	 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//	at CheckedException.ArrayIndexOutOfBoundsException.main(ArrayIndexOutOfBoundsException.java:11)


}
