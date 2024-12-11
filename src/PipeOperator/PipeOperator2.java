package PipeOperator;

import java.util.Scanner;

public class PipeOperator2 {

	public static void main(String[] args) {
		try
		{
			System.out.println("try block");
			Scanner scn = new Scanner (System.in);
			System.out.println("Enter a num");
			int num = scn.nextInt();
			int index = 10/num;
			int[] a= {1,2,3};
			System.out.println(a[index]);
			System.out.println("character".charAt(10));
		}
		catch (ArithmeticException | NullPointerException | NumberFormatException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception raised within try block" +e);
		}
		finally
		{
			System.out.println("I will always execute regardness of an exeption");
		}
        System.out.println("rest of the code");
	}

}

//try block
//Enter a num
//0
//Exception raised within try blockjava.lang.ArithmeticException: / by zero
//I will always execute regardness of an exeption
//rest of the code

