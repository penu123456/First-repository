package xpaths;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Doubleclick {
	
	WebDriver driver;
	
  @Test
  public void Action() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://testautomationpractice.blogspot.com");
		
		
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait 
		
        WebElement ele=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
        Actions act=new Actions(driver);
		
        
        Thread.sleep(3000);
		
        act.doubleClick(ele).perform();
		

	  
	  
	  
	  
  }
}
