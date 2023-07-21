package javascript_executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class send_click {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait 

		
	    WebElement username=driver.findElement(By.name("username"));
	    WebElement password=driver.findElement(By.name("password"));
	   WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
	    
	
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].setAttribute('value','admin')",username);
	    js.executeScript("arguments[0].setAttribute('value','admin123')",password);
	    
	    
	    js.executeScript("arguments[0].click()",login);
	    
	    

  }
}
