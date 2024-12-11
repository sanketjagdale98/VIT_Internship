import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	public static void main(String[] args) {
		ChromeDriver Driver = new ChromeDriver ();
		Driver.get("https://demo.guru99.com/V4/");
		Driver.manage().window().maximize();
		
		WebElement UserID = Driver.findElement(By.name("uid"));
		WebElement password = Driver.findElement(By.name("password"));
		
		
		UserID.sendKeys("mngr603548");
		password.sendKeys("AhEhUgA");
		
		 Driver.findElement(By.name("btnLogin")).click();
		 Driver.findElement(By.linkText("Log out")).click();
		
		Driver.close();
		
		

	}

}
