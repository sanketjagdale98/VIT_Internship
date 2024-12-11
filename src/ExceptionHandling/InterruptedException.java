package ExceptionHandling;

public class InterruptedException {

	public static void main(String[] args) throws java.lang.InterruptedException  {
		
		Thread.sleep(2000); //error: unreported exception InterruptedException ;must be caught or declared to be thrown

	}
}
