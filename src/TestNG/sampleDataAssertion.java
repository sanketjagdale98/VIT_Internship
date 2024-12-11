
package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sampleDataAssertion {
	
	@Test
	public void Test1()
	{
		String exp = "Facebook Title";
		String act = "Facebook ";
		
		Assert.assertEquals(act,exp,"Expected title doesn't match with actual");
		System.out.println("Statement after Assertion......!!!");
	}
	
	@Test
	public void Test2()
	{
		String exp = "Facebook Title";
		String act = "Facebook Title";
		
		Assert.assertEquals(act,exp,"Expected title  match with actual");
		System.out.println("Statement after Assertion......!!!");
	}
	
	@Test
	public void Test3()
	{
	
		Assert.assertFalse (true,"Expected Flase but found True");
		System.out.println("Statement after Assertion......!!!");
	}
	
	@Test
	public void Test4()
	{
	
		Assert.assertFalse (false,"Expected false  found False");
		System.out.println("Statement after Assertion......!!!");
	}
	
	@Test
	public void Test6()
	{
	
		Assert.assertTrue (true,"Expected true  found true");
		System.out.println("Statement after Assertion......!!!");
	}

}
