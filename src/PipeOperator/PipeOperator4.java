package PipeOperator;

public class PipeOperator4 {

	public static void main(String[] args) {
		{
			
			try
			{
				System.out.println("try block");
				Thread.sleep(3000);
				System.out.println("char".charAt(4));
			}
			catch (InterruptedException | StringIndexOutOfBoundsException e )
			{
				System.out.println("Exception raised within try block "+e);
			}
			System.out.println("Rest of the app");

		}
	}
	}


//try block
//Exception raised within try block java.lang.StringIndexOutOfBoundsException: String index out of range: 4
//Rest of the app
