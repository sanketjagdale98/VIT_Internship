package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import net.bytebuddy.implementation.bytecode.Throw;

public class LocatorBasedOnClassName {

	public static void main(String[] args)   {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		String expheading = "Facebook helps you connect and share with the people in your life.";
		WebElement fb_heading = driver.findElement(By.className("_8eso"));
		String heading = fb_heading.getText();
		
		if (expheading.equals(heading))
		{
			System.out.println("matched with expected heading " + heading);
			
		}
		 System.out.println(driver.findElement(By.className("_8esh")).getText());
		 
		// driver.findElement(By.className("inputtext _55r1 _6luy _9npi")).sendKeys("hello"); doubt line not running
	
		 
		 
		 driver.close();
		
		
		
	}

}
