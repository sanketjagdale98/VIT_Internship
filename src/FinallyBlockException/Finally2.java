package FinallyBlockException;

public class Finally2 {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("try block");
			System.out.println("Vasant".charAt(6));
		}
		
		catch (NullPointerException e)
		{
			System.out.println("catch block" + e);
		}
		finally
		{
			System.out.println("finally block ");
		}
		System.out.println("Rest of code");
		
		

	}

}
//1. abnormal termination of an application
//2. rest of the code will never get execute
//try block
//finally block 
//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 6
//	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
//	at java.base/java.lang.String.charAt(String.java:1517)
//	at FinallyBlockException.Finally2.main(Finally2.java:10)







