package TestNG;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertion {
	
	@Test
	public void hardAssert() {
		System.out.println("Statement before assertion1");
		Assert.assertTrue(true);
		
		System.out.println("Statement after assertion1");
		Assert.assertTrue(false);
		
		System.out.println("Statement after assertion failed1");
		
	}

	@Test
	public void SoftAssert() {
		
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Statement before assertion");
		softAssert.assertTrue(true);
		
		System.out.println("Statement after assertion");
		softAssert.assertTrue(false);
		
		System.out.println("Statement after assertion failed");
		
		softAssert.assertAll();
	}
}
