package PipeOperator;

import java.util.Scanner;

public class PipeOperator3 {

	public static void main(String[] args) {
		{
			System.out.println("try block");
			Scanner scn= new Scanner(System.in);
			System.out.println("Enter a num ");
			int num = scn.nextInt();
			int index= 10/num;
			int[] a={1,2,3};
			System.out.println(a[index]);
			Thread.sleep(3000);
			System.out.println("vasant".charAt(num));

		}
		catch (Exception e)
		{
			System.out.println("Exception raised within try block "+e);
		}
		
		finally {
			
		}
		{
			System.out.println("I will always execute regardless of an exception within try block");
		}
		System.out.println("Rest of the code");
	}
}
//try block
//Ent a number
//0
//Exception raised within try block java.lang.ArithmeticException: / by zero
//I will always execute regardness of an execiton
//rest of the code



