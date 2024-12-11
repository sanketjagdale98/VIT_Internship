package FinallyBlockException;

public class Finally5 {

	public static void main(String[] args) {
		try
		{
			System.out.println("try block");
			System.out.println(10/0);
		}
		finally
		{
			System.out.println("finally block");
		}
			System.out.println("Rest of the code");
		}
		

	}


//try block
//finally block
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at FinallyBlockException.Finally5.main(Finally5.java:9)


