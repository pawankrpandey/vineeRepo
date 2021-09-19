package TestFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import reposetories.FCHomePage;
import reposetories.FCLoginPage;


public class LoginApplication {
	
	@Test
	public void Login()
	{
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.firstcry.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		FCHomePage fhm=new FCHomePage(driver);
		fhm.search().click();
		fhm.search().sendKeys("tees");
		fhm.submit().click();
		
		FCLoginPage flp= new FCLoginPage(driver);
		
		flp.LoginLink().click();
		flp.emailID().click();
		flp.emailID().sendKeys("vineejsr@gmail.com");
		flp.continuebtn().click();
		
	}
	
	
	

}
