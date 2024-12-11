import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		System.out.println(driver.getTitle() + "    " + driver.getCurrentUrl());
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]/button")).click();
		
		Alert alert = driver.switchTo().alert(); //
	
		alert.accept();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//p[@id=result']")).getText());
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='click fro JS Confirm')")).click();
		
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
	}

}
