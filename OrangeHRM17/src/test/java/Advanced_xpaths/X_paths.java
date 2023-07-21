package Advanced_xpaths;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class X_paths {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ; 
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait 
		
	  driver.findElement(By.linkText("Selenium Practice")).click();
	  driver.findElement(By.linkText("XPath Practice")).click();
	  driver.findElement(By.xpath("(//div[@class='container']//following::input[@type='text'])[3]")).sendKeys("megopichand@gmail.com");
	  driver.findElement(By.xpath("(//div[@class='container']//following::input[@type='password'])[1]")).sendKeys("123456789");
	  
	  driver.findElement(By.xpath("//button[text()='Register']")).click();
		 

	  
	  
  }
}
