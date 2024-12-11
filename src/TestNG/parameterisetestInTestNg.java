package TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterisetestInTestNg {
	
	@Test
	@Parameters({"uname","paard"})
	
	public void login(@Optional("sanket@123") String Username,
			@Optional("sanket@12$") String Passward)
			
			{
		
		System.out.println("username is >>"+Username);
		System.out.println("passward is ..."+Passward);

}
}	