package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class drop_down {
	
	WebDriver driver;
	
  @Test
  public void test1() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait 

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	    driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click();
	    driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span/i")).click();
	    driver.findElement(By.xpath("//a[text()='Locations']")).click();
	    driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();

		//driver.findElement(By.xpath("//div[@role='listbox']//following-sibling::div[text()='Albania']")).click();
		
			    
	  driver.findElement(By.xpath("//span[text()='Albania']")).click();
	  
  }
}
