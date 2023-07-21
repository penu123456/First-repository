package screenshots;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class screenshot_2 {
	
	WebDriver driver;
	
  @Test
  public void maintest1() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
	  	driver.get("https://www.amazon.in");
	  	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait
		
	//driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();
	  driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]")).click();
		
		Thread.sleep(6000);
	  
	  driver.findElement(By.linkText("Sign in")).click();
	  
	
    JavascriptExecutor js=(JavascriptExecutor)driver;
  
   // WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
    
    WebElement email=driver.findElement(By.id("ap_email"));

	js.executeScript("arguments[0].setAttribute('value','megopichand@gmail.com')",email);
    
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Gopi@527");
    
    driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
    
    
    
    
    
	  
  }
}
