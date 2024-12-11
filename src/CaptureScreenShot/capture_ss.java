package CaptureScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class capture_ss {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//form[@class='_9vtf']"));
		File scrFile = ele.getScreenshotAs(OutputType.FILE);
		File target = new File("./screenshots/form_empty.png");
		

		FileHandler.copy(scrFile, target);
		
		driver.close();
	}

}
