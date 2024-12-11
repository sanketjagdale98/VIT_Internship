package sel3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class LaunchChromeBrowser {
//
////	public static void main(String[] args) {
////
////		FirefoxDriver driver = new FirefoxDriver();
////			driver.get("https://www.facebook.com");
////			driver.manage().window().maximize();
////			
////			String expHeading ="Facebook helps you  connect and share with the peoplein your life.";
////			WebElement fb_heading = driver.findElement(By.className("_8eso"));
////			String heading = fb_heading.getText();
////			driver.close();
////
////	}
//
//}
//  


//public class LaunchChromeBrowser {
//	public static void main(String[] args) {
//		FirefoxDriver driver =new FirefoxDriver();
//		driver.get("https://www.facebook.com");
//		driver.manage().window().maximize();
//		
//		String pageTitle = driver.getTitle();
//		System.out.println("Facebook Login Page Title: "+pageTitle);
//		
//		String currentURL = driver.getCurrentUrl();
//		System.out.println("Facebook current URL:"+currentURL);
//		
//		String pageSource = driver.getPageSource();
//		
//		System.out.println(pageSource.contains(pageTitle));
//		
//		driver.close();
//		
//	}
//}
//		
		
		

//public class LaunchChromeBrowser {
//public static void main(String[] args) {
//	FirefoxDriver driver =new FirefoxDriver();
//	driver.get("https://www.facebook.com");
//	driver.manage().window().maximize();
//	
//	WebElement forgottenPasswordLink = driver.findElement(By.partialLinkText("password?"));
//    
//	String expTxt = "Forgotten password?";
//	String aclTxt = forgottenPasswordLink.getText();
//	
//	if (expTxt.equals(aclTxt)) {
//		forgottenPasswordLink.click();
//	}
//	
//	driver.navigate().back();
//	
//	driver.findElement(By.partialLinkText("Sign")).click();
//	driver.close();
//}
//}





//public class LaunchChromeBrowser {
//	public static void main(String[] args) {	
//		
//		FirefoxDriver driver =new FirefoxDriver();
//		Navigation navigate = driver.navigate();
//		
//		navigate.to("https://www.facebook.com");
//		System.out.println(driver.getCurrentUrl()+"  "+driver.getTitle());
//		
//		driver.findElement(By.linkText("Forgotten password?")).click();
//		System.out.println(driver.getCurrentUrl()+"  "+driver.getTitle());
//		
//		navigate.back();
//		System.out.println(driver.getCurrentUrl()+"  "+driver.getTitle());
//		
//		navigate.forward();
//		System.out.println(driver.getCurrentUrl()+"  "+driver.getTitle());
//		
//		navigate.refresh();
//		System.out.println(driver.getCurrentUrl()+"  "+driver.getTitle());
//		
//		navigate.back();
//		System.out.println(driver.getCurrentUrl()+"  "+driver.getTitle());
//		
//		navigate.refresh();
//		System.out.println(driver.getCurrentUrl()+"  "+driver.getTitle());
//	
//	    driver.close();
//	}
//	
//		
//}

		



	

