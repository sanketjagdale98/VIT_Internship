package sel3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTextVSGetAttribute {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.className("_8eso"));
		String fb_txt=ele.getText();
		System.out.println(fb_txt);
		
		System.out.println(ele.getAttribute("innerHTML"));
		
		String emailTxt = driver.findElement(By.name("pass")).getAttribute("placeholder");
		System.out.println(emailTxt);
		
		
		
		driver.quit();
		}

}
