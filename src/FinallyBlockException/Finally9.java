package FinallyBlockException;

import TryCatch.trycatchaArithmaticException;

public class Finally9 {

	public static void main(String[] args) {
		
		try 
		{
			System.out.println("try block");
			System.out.println(10/0);
		}
        catch(ArithmeticException ee)
		{
        	System.out.println("Catch block" +ee);
		}
		try
		{
			System.out.println("Try block repeat");
			System.out.println("Vasant".charAt(7));
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("Rest of the code");
	}

}



//try block
//Catch blockjava.lang.ArithmeticException: / by zero
//Try block repeat
//finally block
//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 7
//	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
//	at java.base/java.lang.String.charAt(String.java:1517)
//	at FinallyBlockException.Finally9.main(Finally9.java:21)
