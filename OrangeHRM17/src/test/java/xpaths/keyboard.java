package xpaths;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.api.robot.Key;
import org.testng.annotations.Test;

public class keyboard {
	
	WebDriver driver;
	
  @Test
  public void keys() throws InterruptedException {
	  
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	    
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait 
      
    driver.findElement(By.xpath("//input[@id='target']"));
      
    Actions act=new Actions(driver);
    
    act.sendKeys(Keys.HOME).perform();
    
    Thread.sleep(3000);
    
    act.sendKeys(Keys.CANCEL).perform();
    
    Thread.sleep(3000);
    
    act.sendKeys(Keys.ALT).perform();
    
    Thread.sleep(3000);
    
    act.sendKeys(Keys.ARROW_DOWN).perform(); 
    
    
    Thread.sleep(3000);
  }
}
