package Advanced_xpaths;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class My_trip {
	
	WebDriver driver;
	
  @Test
  public void Makemytrip() throws Exception {
	  
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ; 
		driver.get("https://makemytrip.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait 
		
		
		//String num="18";
		//String YYMM="July 2023";
		
		//String str="(//div[text()='+MMYYYY+']//following::div[@class='dateInnerCell'])["+num+"]";
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		//driver.findElement(By.xpath("//div[text()='+MMYYYY+']//following::div[@class='dateInnerCell'])[+num+]\";")).click();
		
		driver.findElement(By.xpath("(//div[text()='July 2023']"));
	
		
		driver.findElement(By.xpath("(//div[@class='dateInnerCell'])[18]"));
		
		
		
		WebElement trip=driver.findElement(By.className("//i[@class='wewidgeticon we_close']"));
		
		
		
		
		
		
  }
}
