package xpaths;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Resize {
	
	WebDriver driver;
	
  @Test
  public void Hold() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://jqueryui.com/resizable/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait 
		
        driver.switchTo().frame(0);
		
		WebElement resize=driver.findElement(By.xpath("\n"
				+ "\n"
				+ "//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
	
		
		Actions act=new Actions(driver);
		
		act.dragAndDropBy(resize,100,50).perform();
		
		//act.clickAndHold(resize).moveByOffset(100,50).build().perform();
		
		
		

	  
	  
	  
  }
}
