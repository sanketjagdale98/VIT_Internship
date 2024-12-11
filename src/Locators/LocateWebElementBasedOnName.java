package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateWebElementBasedOnName {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
		
        driver.manage().window().maximize();
        
        WebElement username_txt = driver.findElement(By.name("email"));
        WebElement password_txt = driver.findElement(By.name("pass"));
        
        username_txt.sendKeys("sanketjagdale@facebbok.com");
        password_txt.sendKeys("sankethugf@S3");
        
        Thread.sleep(3000);
        
        username_txt.clear();
        password_txt.clear();
        
        username_txt.sendKeys("vaibahv@facebbok.com");
        password_txt.sendKeys("vaibhf@S3");
        
        Thread.sleep(3000);
        
        driver.findElement(By.name("login")).click();
        Thread.sleep(3000);
        driver.close();
        
        
        
        
		
		
	}

}
