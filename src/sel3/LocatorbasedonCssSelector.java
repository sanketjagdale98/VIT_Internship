package sel3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorbasedonCssSelector {

	public static void main(String[] args) throws InterruptedException {
		

	ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
		
		driver.findElement (By.cssSelector("input[id='email']")).sendKeys("sanket@facebook.com");
		driver.findElement (By.cssSelector("input[id='pass']")).sendKeys("sanket@facebook.com");
		driver.findElement (By.cssSelector("button[type='submit']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div[class='_9ay7']")).getText());
		
		Thread.sleep(3000);
		
		driver.quit();
}
	
	}

