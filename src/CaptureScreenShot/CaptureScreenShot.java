package CaptureScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File scrFile = ts.getScreenshotAs(OutputType.FILE);
		File target= new File("./screenshot/fb_login.png");
		
		FileHandler.copy(scrFile, target);
		
		
		driver.findElement(By.name("email")).sendKeys("vasant@facebbok.com");
		driver.findElement(By.name("pass")).sendKeys("vasant@123$");
		
		File scrFile1 = ts.getScreenshotAs(OutputType.FILE);
		File target1= new File("./screenshot/fb_txt.png");
		
		FileHandler.copy(scrFile1, target1);
			
		
		System.out.println("screenshots capture");
		driver.close();
		
		
	}

}