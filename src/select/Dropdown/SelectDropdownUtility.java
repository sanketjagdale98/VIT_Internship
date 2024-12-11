package select.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownUtility {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		WebElement dayDD=driver.findElement(By.name("birthday_day"));
		WebElement monthDD=driver.findElement(By.name("birthday_month"));
		WebElement yearDD=driver.findElement(By.name("birthday_year"));
		
		//utility function to handle dropdown values of any drop down
		//by using index,value,visible bytext
		
		handleSelectDropdownByUsingIndex1(dayDD,9);
		handleSelectDropdownByUsingIndex1(monthDD,6);
		handleSelectDropdownByUsingIndex1(yearDD,20);
		
		handleSelectDropdownByUsingValue(dayDD,"4");
		handleSelectDropdownByUsingValue(monthDD,"5");
		handleSelectDropdownByUsingValue(yearDD,"2021");
		
		handleSelectDropdownByUsingVisibleTxt(dayDD,"22");
		handleSelectDropdownByUsingVisibleTxt(monthDD,"Apr");
		handleSelectDropdownByUsingVisibleTxt(yearDD,"2020");
		
	}
static void handleSelectDropdownByUsingIndex1(WebElement dropdown, int index)
{
	new Select (dropdown ).selectByIndex(index);
}

static void handleSelectDropdownByUsingValue(WebElement dropdown, String value)
{
	new Select (dropdown ).selectByValue(value);
}

static void handleSelectDropdownByUsingVisibleTxt(WebElement dropdown, String visibleTxt)
{
	new Select (dropdown ).selectByVisibleText(visibleTxt);
}
	


}
