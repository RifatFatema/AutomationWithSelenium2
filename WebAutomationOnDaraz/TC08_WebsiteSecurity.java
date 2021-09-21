package Automation.com;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class TC08_WebsiteSecurity extends DriveSet{
	public static String baseURL = "https://www.daraz.com.bd/";

	@Test // TestNG Annotation
	public static void WebsiteSecurity() throws InterruptedException {
	driver.get(baseURL); // Get base url and run on browser
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); // maximize the browser window
	Thread.sleep(1000); // used for  waiting 
	}
	public static void isWebsiteSecured() 
	{
		String myUrl=driver.getCurrentUrl();
		
		if(myUrl.contains("https")) 
		{
			System.out.println("Site is secured");
		}else 
		{
			System.out.println("Site is not secured");
		}
}
}