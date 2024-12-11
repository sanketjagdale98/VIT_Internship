package ExceptionHandling;

public class applicationwithouttryblock {

	public static void main(String[] args) {
		
		System.out.println("Statement one");
		System.out.println("sstatement two");
		System.out.println(100/0); //AE
		System.out.println("Rest of code");

	}

}

//statement one
//statement two
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at Test.main(Test.java:11)
