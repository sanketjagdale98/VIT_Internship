package FinallyBlockException;

public class Finallysimple {

	public static void main(String[] args) {
		
    try {
    	System.out.println("try block");
	}
     catch(Exception e)
    {
    	 System.out.println("try block");
    }
    
    finally
    {
    	System.out.println("Finally block");
    }
    
    System.out.println("Rest of the code");
	}
}

//try block
//Finally block
//Rest of the code



