package com.Handle_Multiple_tab_or_Window;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        
        driver.manage().window().maximize();
        
        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);
        
        System.out.println(driver.getTitle()+ "  "+driver.getCurrentUrl());
        
        driver.switchTo().newWindow(WindowType.WINDOW);
        
        System.out.println(driver.getTitle()+ "  "+driver.getCurrentUrl());
        
        driver.get("http:/www.gmail.com");
        System.out.println(driver.getTitle()+ "  "+driver.getCurrentUrl());
        
        driver.close();
        
        driver.switchTo().window(parentWindow);
        
        System.out.println(driver.getTitle()+"  "+driver.getCurrentUrl());
        
        driver.close();
        

	}

}
