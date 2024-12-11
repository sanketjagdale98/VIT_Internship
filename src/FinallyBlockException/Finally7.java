package FinallyBlockException;

public class Finally7 {

	public static void main(String[] args) {
	try
	{	 System.out.println("try block");
         System.exit(0);
	}
	catch(Exception e)
	{
		System.out.println("catch block" +e);
	}
	
	finally
	{
		System.out.println("Finally block");
	}
	
	System.out.println("Rest of the code");
	

}
}


//there are two ways where finally block will never get execute:
//case 1 : exit from run at runtime
//
//try block