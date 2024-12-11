package TestNG;

import org.testng.annotations.Test;

public class DependentTestInTestNG {

	
	@Test(enabled = false)
	public void login()
	{
		System.out.println("test1"); 
	}
	
	@Test(dependsOnMethods = "login")
	public void logout()
	{
		System.out.println("test2");
	}
	
	@Test
	public void enteruser()
	{
		System.out.println("enteruser  ");
	}
	
}
