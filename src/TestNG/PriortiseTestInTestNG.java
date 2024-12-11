package TestNG;

import org.testng.annotations.Test;

public class PriortiseTestInTestNG {
	
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("login");
	}
	
	@Test(priority = -2)
	public void logout()
	{
		System.out.println("logout");
	}
	
	@Test(priority = -1)
	public void signup()
	{
		System.out.println("signup");
	}
	
	@Test(priority = 0)
	public void create()
	{
		System.out.println("create");
	}
	
	@Test(priority = 1)
	public void forgot()
	{
		System.out.println("forgot");
	}
	
	
}
