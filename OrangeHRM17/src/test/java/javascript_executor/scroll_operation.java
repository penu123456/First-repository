package javascript_executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scroll_operation {
	
	WebDriver driver;
	
  @Test
  public void Scroll() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
	  	driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait
		

		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0,2000)");
		
		Thread.sleep(5000);
		
		//js.executeScript("window.scrollBY(0,1000)");//2000-3000
		
		WebElement elem=driver.findElement(By.linkText("Germany"));
		
		js.executeScript("arguments[0].scrollIntoView()",elem);
		
  }
}
