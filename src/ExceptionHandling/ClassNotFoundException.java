package ExceptionHandling;

public class ClassNotFoundException {

	static
	{
		System.out.println("class - ClassNotFoundException static block ");
		
	}

}

class Test {
	public static void main (String[]args) throws java.lang.ClassNotFoundException
	{
		Class.forName("ClassNotFoundException");
	}
}

