package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorBasedOnPartialLink {

	public static void main(String[] args)  {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement ForgottenPasswordLink = driver.findElement(By.partialLinkText("password?"));
		
		String expTxt = "Forgotten password?";
		String aclTxt = ForgottenPasswordLink.getText();
		
		if (expTxt.equals(aclTxt)) {
			
			ForgottenPasswordLink.click();
			
		}
	    driver.navigate().back();
	    
	    driver.findElement(By.linkText("Create a Page")).click();

	    driver.close();  
	    
	}

}
