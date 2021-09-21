package Automation.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC09_CheckScroll extends DriveSet{
	public static String baseURL = "https://www.daraz.com.bd/";

	@Test // TestNG Annotation
	public static void CheckKeyboardEvent() throws InterruptedException {
	driver.get(baseURL); // Get base url and run on browser
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); // maximize the browser window
	Thread.sleep(1000); // used for  waiting 
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	//Scroll to Bottom
	 Thread.sleep(5000);
	js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	Thread.sleep(5000);
	//Scroll to Top
	js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
	Thread.sleep(5000);
	//Scroll to specific Element
	WebElement e=driver.findElement(By.xpath("//div[contains(text(),'পণ্য')]"));
	js.executeScript("arguments[0].scrollIntoView();",e);
	
	Thread.sleep(5000);
}
}
