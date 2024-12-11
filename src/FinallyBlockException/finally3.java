package FinallyBlockException;

public class finally3 {

	public static void main(String[] args) {
		
		try {
		System.out.println("try block");
		System.out.println("Vasant".charAt(9));
		
	}
      catch (StringIndexOutOfBoundsException e)
      {
         System.out.println("catch block");
         System.out.println(10/0);
	}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("Rest of the code");

}
	}


//
//try block
//catch block
//finally block
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at FinallyBlockException.finally3.main(finally3.java:15)