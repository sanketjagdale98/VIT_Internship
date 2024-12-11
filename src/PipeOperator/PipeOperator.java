package PipeOperator;

import java.util.Scanner;

public class PipeOperator {

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
		}
		catch(ArithmeticException | NullPointerException | NumberFormatException | ArrayIndexOutOfBoundsException ee)
		{
			System.out.println("Exception raised within try block " +ee);
		}
		finally
		{
			System.out.println("I will always execute regardness of an exception within try block ");	
		}
		System.out.println("Rest of the code");
	}

	}



//try block
//Enter a num
//10
//2
//I will always execute regardness of an exception within try block 
//Rest of the code



//try block
//Enter a num
//0
//Exception raised within try block java.lang.ArithmeticException: / by zero
//I will always execute regardness of an exception within try block 
//Rest of the code
