package FinallyBlockException;

public class Finally6 {

	public static void main(String[] args) {
		try
		{
			System.out.println("try block ");
			System.out.println(10/0);		
		}
		System.out.println();
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



//statement between try-catch and finally is invalid
//try block
//Exception in thread "main" finally block
//java.lang.ArithmeticException: / by zero
//	at FinallyBlockException.Finally5.main(Finally5.java:9)
