package multipletabs;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
public class Tabs {
	
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
	  	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait 



       //open a new tab
	 ((JavascriptExecutor)driver).executeScript("window.open()"); 
	 
	 Set<String> Handles=driver.getWindowHandles();
	 
	 ArrayList<String> tabs=new ArrayList<String>(Handles);
	 
	 driver.switchTo().window(tabs.get(1));
	 driver.get("https://www.google.com");
	 
	    Thread.sleep(3000);
	 
	 driver.switchTo().window(tabs.get(0));
	 
	 driver.findElement(By.name("username")).sendKeys("Admin");
	 driver.findElement(By.name("password")).sendKeys("admin123");
		
	  
  }
}
