package sel3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuit {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        driver.manage().window().maximize();
        
        System.out.println(driver.getTitle());
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]")).click();
        
        System.out.println(driver.getTitle());
        
        Thread.sleep(3000);
        
        driver.quit();
        
        
	}

}
