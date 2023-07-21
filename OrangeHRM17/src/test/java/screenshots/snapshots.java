package screenshots;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class snapshots {
	
	WebDriver driver;
	
  @Test
  public void picture() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait 
		
		TakesScreenshot ss=(TakesScreenshot)driver;
		
		File f1=ss.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f1,new File("F://login//screenshot1.jpg"));
		driver.findElement(By.name("username")).sendKeys("Admin");
		 File f2=ss.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(f2, new File("F://Login//screenshot2.jpeg"));
		
		 driver.findElement(By.name("password")).sendKeys("admin123");
		 File f3=ss.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(f3, new File("F://Login//screenshot3.jpeg"));
		
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(5000);
		 File f4=ss.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(f4, new File("F://Login//screenshot4.jpeg"));
		
		
		

	  
  }
}
