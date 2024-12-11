package TestNG;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGTest {

	

	
	@BeforeSuite
	public void befosuite()
	{
		System.out.println("beforesuite");
	}

		
		@Test
		public void testngtest()
		{
			System.out.println(" TestNG test ");
		}
		
		@AfterSuite
		public void aftersiute()
		{
			System.out.println("afterSuite");
		}
	
	}


