package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorBasedOnLinkText {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement ForgottenPasswordLink = driver.findElement(By.linkText("Forgotten password?"));
		
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
