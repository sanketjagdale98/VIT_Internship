package select.Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectCommands {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		WebElement MonthDD=driver.findElement(By.name("birthday_month"));
		
		Select sel = new Select(MonthDD);
		sel.selectByVisibleText("Aug");
		
		WebElement firstSelectedoption = sel.getFirstSelectedOption();
		
		System.out.println("My First Selected value is "+ sel.getFirstSelectedOption().getText());
		
        sel.selectByVisibleText("Jan");
		
		System.out.println("My Second Selected value is "+ sel.getFirstSelectedOption().getText());
		
		 List<WebElement> MonthDDOptions = sel.getOptions();
		 
		 System.out.println(MonthDDOptions.size());
		 
		 
		
		
		

	}

}
