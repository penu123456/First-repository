package xpaths;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Slider {
	
	WebDriver driver;
	
  @Test
  public void Slide() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://jqueryui.com/slider/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait
		
		
       driver.switchTo().frame(0);
		
		WebElement Slide=driver.findElement(By.xpath("//span[@tabindex='0']"));
	
		
		Actions act=new Actions(driver);
		
		 //act.dragAndDropBy(Slide,100,0).perform();
		
		act.clickAndHold(Slide).moveByOffset(100,0).build().perform();
	
	  
  }
}
