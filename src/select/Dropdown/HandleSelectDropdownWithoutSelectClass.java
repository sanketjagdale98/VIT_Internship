package select.Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleSelectDropdownWithoutSelectClass {

	public static void main(String[] args) {
		
		public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://www.facebook.com");
			driver.manage().window().maximize();
			
			driver.findElement(By.linkText("Sign Up")).click();
			
			HandleDropdownWithoutSelectClass(driver,"Dec,"//*[@id="month"])
			
			
			
			static void HandleDropdownWithoutSelectClass(WebDriver driver, String selectoption, String xpath)
			{
				List<WebElement> = driver.findElement(By.xpath(xpath));
				for (WebElement ele:list)
				{
					if (ele.getText().equals(selectoption))
						
					{
						ele.click();
						break;
					}
				}
			}
					}
				}
			}
		

	}

}
