package Automation.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC12_TrackOrder extends DriveSet{
	public static String baseURL = "https://www.daraz.com.bd/";

	@Test // TestNG Annotation
	public static void CheckKeyboardEvent() throws InterruptedException {
	driver.get(baseURL); // Get base url and run on browser
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); // maximize the browser window
	Thread.sleep(1000); // used for  waiting 
	driver.findElement(By.xpath("//span[contains(text(),'Track my order')]")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='topActionTrackEmail']")).sendKeys("rifatfatema22@gmail.com"); // click is a method used for click perform
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='topActionTrackOrderNumber']")).sendKeys("123456"); // click is a method used for click perform
	Thread.sleep(1000);
	driver.findElement(By.xpath("//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[1]/div")).click();  // click is a method used for click perform
	Thread.sleep(1000);
}
}