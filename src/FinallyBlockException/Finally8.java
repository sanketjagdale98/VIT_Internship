package FinallyBlockException;

public class Finally8 {

	public static void main(String[] args) {
System.out.println("vasant".charAt(6));
		
		try
		{
			System.out.println("try block ");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Exception raised in try block");
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("Rest of the application");

	}
}

//case 2 : if exception raised outside try- block.
//
//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 6
//at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
//at java.base/java.lang.String.charAt(String.java:1517)
//at FinallyBlockException.Finally8.main(Finally8.java:6)

