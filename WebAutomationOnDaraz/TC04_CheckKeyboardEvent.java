package Automation.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC04_CheckKeyboardEvent extends DriveSet{
	public static String baseURL = "https://www.daraz.com.bd/";

	@Test // TestNG Annotation
	public static void CheckKeyboardEvent() throws InterruptedException {
	driver.get(baseURL); // Get base url and run on browser
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); // maximize the browser window
	Thread.sleep(1000); // used for  waiting 
	WebElement e = driver.findElement(By.xpath("//input[@class=('search-box__input--O34g')]"));
	Thread.sleep(3000);
	e.sendKeys(Keys.chord(Keys.SHIFT, "Electronics tools"));
	// driver.findElement(locator).sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,Keys.DELETE));
	Thread.sleep(3000);
	e.sendKeys(Keys.chord(Keys.ENTER));
	Thread.sleep(3000);
}
}