package Automation.com;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class TC07_VerifyPageTitle extends DriveSet{
	public static String baseURL = "https://www.daraz.com.bd/";

	@Test // TestNG Annotation
	public static void VerifyPageTitle() throws InterruptedException {
	driver.get(baseURL); // Get base url and run on browser
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); // maximize the browser window
	Thread.sleep(1000); // used for  waiting 

	String pageTitleActual=driver.getTitle();
	System.out.println("The page title is: "+ pageTitleActual);
	Thread.sleep(3000);
}
}