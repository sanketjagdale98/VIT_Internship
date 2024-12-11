package TestNG;

import org.testng.annotations.Test;

public class DisableTestInTestNG {
	
	@Test
	public void test1()
	{
		System.out.println(" test1() ");
	}
	
	@Test(enabled = true)
	public void test2()
	{
		System.out.println(" test2() ");
	}
	
	@Test(enabled = false)
	public void test3()
	{
		System.out.println(" test3() ");
	}

}


