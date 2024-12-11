package com.Handle_Multiple_tab_or_Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleTabOrWindow {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        driver.manage().window().maximize();
        
        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[1]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[4]")).click();
        
        Thread.sleep(3000);
        
        System.out.println(driver.getTitle());
        
           Set<String> winIds = driver.getWindowHandles();
        
        for(String win:winIds)
        	
        {
        	if(!win.equals(parentWindow))
        		
        	{
        		driver.switchTo().window(win);
        		System.out.println(driver.getTitle()+"  "+ win);
        		driver.close();
        		
        		}
        	 }
        
        driver.switchTo().window(parentWindow);
        driver.close();
        
		
		

	}

}
