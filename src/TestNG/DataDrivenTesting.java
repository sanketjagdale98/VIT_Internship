package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {

	@Test(dataProvider = "Regdata" )
	public void getdata(String username, String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider(name = "Regdata")
	public String[][] createData()
	{
		String[][] data = new String[4][2];
		
		data[0][0]="user Name";
		data[0][1]="user Password";
		
		data[1][0]="sanketjagdale@facebook.com";
		data[1][1]="Sanket@1133";
		
		data[2][0]="vaibhav@facebook.com";
		data[2][1]="Vaibhav@123";
		
		data[3][0]="rohan@facebook.com";
		data[3][1]="rohan@123";
		
		return data;
	}
	
		
	
	}



