package Automation.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC11_CheckDoubleClickRightClick extends DriveSet{
	public static String baseURL = "https://www.daraz.com.bd/";

	@Test // TestNG Annotation
	public static void CheckKeyboardEvent() throws InterruptedException {
	driver.get(baseURL); // Get base url and run on browser
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); // maximize the browser window
	Thread.sleep(1000); // used for  waiting 
    Actions a = new Actions(driver);
	
	WebElement doubleClickText = driver.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[3]/a[1]/div[2]"));
	a.doubleClick(doubleClickText).build().perform();
	Thread.sleep(3000);

	
	WebElement rightClick = driver.findElement(By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]"));
	a.contextClick(rightClick).build().perform();
	
	Thread.sleep(3000);
}
}