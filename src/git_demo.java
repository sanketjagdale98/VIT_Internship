

import org.openqa.selenium.chrome.ChromeDriver;

public class git_demo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		String  pageTitle = driver.getTitle();
		System.out.println("Facebook Login Page Title :" + pageTitle);
		
		String currentURL = driver.getCurrentUrl();
		System.out.println("Facebook current URL :" + currentURL);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource.contains(currentURL));
		
		driver.close();
		
		
	

	}

}
