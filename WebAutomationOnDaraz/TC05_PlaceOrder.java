package Automation.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC05_PlaceOrder  extends DriveSet{
	public static String baseURL = "https://www.daraz.com.bd/";

	@Test // TestNG Annotation
	public static void PlaceOrder() throws InterruptedException {
	driver.get(baseURL); // Get base url and run on browser
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); // maximize the browser window
	Thread.sleep(1000); // used for  waiting 
	driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[contains(text(),'ফ্রি শিপিং')]")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/a[1]/a[1]")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	driver.findElement(By.xpath("//body/section[@id='content']/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/a[3]/a[1]")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	
	//driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/a[3]/div[1]/div[2]/span[1]")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[3]/a[1]/div[1]/div[2]/span[1]")).click(); // click is a method used for click perform
	Thread.sleep(1000);
    driver.findElement(By.xpath("//span[contains(text(),'Buy Now')]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//body/div[8]/div[1]/div[2]/a[1]/i[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("rifatfatema22@gmail.com"); // click is a method used for click perform
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("a123456"); // click is a method used for click perform
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[contains(text(),'Google')]")).click(); // click is a method used for click perform
	Thread.sleep(1000);
}

}
