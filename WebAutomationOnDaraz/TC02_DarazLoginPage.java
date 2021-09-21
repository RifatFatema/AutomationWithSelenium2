package Automation.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class TC02_DarazLoginPage extends DriveSet{

public static String baseURL = "https://www.daraz.com.bd/";

@Test // TestNG Annotation
public static void login() throws InterruptedException {
driver.get(baseURL); // Get base url and run on browser
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize(); // maximize the browser window
Thread.sleep(1000); // used for  waiting 

driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).click(); // click is a method used for click perform
Thread.sleep(1000);
//driver.findElement(By.xpath("//button[@class='mod-button mod-button mod-third-party-login-btn mod-third-party-login-google']")).click(); // click is a method used for click perform
Thread.sleep(1000);
driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("rifatfatema22@gmail.com"); // click is a method used for click perform
Thread.sleep(1000);
driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("a123456"); // click is a method used for click perform
Thread.sleep(1000);
driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]")).click(); // click is a method used for click perform
Thread.sleep(1000);

}

}
