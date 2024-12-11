package FinallyBlockException;

public class Finally1{

	public static void main(String[] args) {
		
		try {
			System.out.println("try block");
			System.out.println("Vasant".charAt(6));
			System.out.println("Statement after sleeping");
		}
		
		catch(Exception e)
		{
			System.out.println("catch block" +e);
		}
		finally
		{
			System.out.println("finally block");
		}
        System.out.println("Rest of code");
	}

}



//try block
//catch blockjava.lang.StringIndexOutOfBoundsException: String index out of range: 6
//finally block
//Rest of code

