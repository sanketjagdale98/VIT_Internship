//package TryCatch;
//
//import java.util.Scanner;
//
//public class trycatchaArithmaticException {
//
//	public static void main(String[] args) {
//		
////		System.out.println("Statement one");
////		System.out.println("sstatement two");
////		
////		try {
////		System.out.println(100/0); 
////		
////		}
////		
////		catch(ArithmeticException e )
////		{
////			System.out.println("Exception raised in try block "+e);
////		}
////		System.out.println("Rest of code");
////
//		
//		System.out.println("statement one");
//		System.out.println("statement two");
//		Scanner scn = new Scanner (System.in);
//		int num  =scn.nextInt();
//		try {
//			System.out.println(10/num);  //AE
//		}
//		catch (ArithmeticException e )
//		{
//			System.out.println("Exception raised in try block" +e);
//		}
//		System.out.println("rest of the code");
//			
//	}
//	}
//
////statement one
////statement two
////0
////Exception raised in try blockjava.lang.ArithmeticException: / by zero
////rest of the code
//
////statement one
////statement two
////10
////1
////rest of the code





package TryCatch;

import java.util.Scanner;

public class trycatchaArithmaticException {

	public static void main(String[] args) {
		
		System.out.println("satement oane");
		System.out.println("Statement two");
		Scanner scn = new Scanner (System.in);
		int num = scn.nextInt();
		try {
			System.out.println(10/num);
		}
		
		catch(NullPointerException e)
				{
			System.out.println("Exception raised in try block" +e);
				}
		System.out.println("rest of the code");
		
	}

}

//satement oane
//Statement two
//0
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at TryCatch.trycatchaArithmaticException.main(trycatchaArithmaticException.java:67)


//satement oane
//Statement two
//10
//1
//rest of the code




