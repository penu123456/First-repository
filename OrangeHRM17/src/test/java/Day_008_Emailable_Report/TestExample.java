package  Day_008_Emailable_Report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.*;

public class TestExample
{
	
	WebDriver driver;
	@Test
	public void Test1() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
	    Reporter.log("Pass- open Orangehrm");
	    Thread.sleep(4000);
	    
		driver.findElement(By.name("username")).sendKeys("Admin");
		Reporter.log("Pass- Enter User Name");
		
		driver.findElement(By.name("password")).sendKeys("admin123");	
		Reporter.log("Pass- Enter Password");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Reporter.log("Pass- Click on Signin");
		
		driver.close();
	
	}

}












