package javascript_executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
public class borderheighlighting {
	
	WebDriver driver;
	
  @Test
  public void colour() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait 
  
		
	    WebElement username=driver.findElement(By.name("username"));
	    WebElement password=driver.findElement(By.name("password"));
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    
	    js.executeScript("arguments[0].style.border='5px solid pink'", username);
	    
	    js.executeScript("arguments[0].style.border='5px solid green'", password);
	    
	    js.executeScript("arguments[0].style.background='yellow'", password);
	    
	    
	    
		
  }
}
