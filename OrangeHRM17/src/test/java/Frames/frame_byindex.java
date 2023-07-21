package Frames;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class frame_byindex {
	
	WebDriver driver;
	
  @Test
  public void concepts() throws Exception {
	  
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ; 
		driver.get("https://dzhxn2zqob34wazgtozeqg.on.drv.tw/www.bhavasri.com/frames/allcontacts.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait 
		
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		
		int framecount=frames.size();
		
		System.out.println("no of frmes"+framecount);
		
		driver.switchTo().frame(0);
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("gopi");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("siva");
		

		driver.findElement(By.xpath("//textarea[@id='subject1']")).sendKeys("hello gopi");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("venky");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("nari");
		
		driver.findElement(By.xpath("//textarea[@id='subject']")).sendKeys("hi venky");
		
		driver.switchTo().defaultContent();
		
  }
}
