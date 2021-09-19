package reposetories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FCLoginPage {
	
	
	WebDriver driver;
	
	public FCLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
 
	@FindBy(xpath="//li[@class='logreg']/span[1]")
	WebElement LoginLink;
	
	@FindBy (id="lemail")
	WebElement emailId;
	
	@FindBy (xpath="//div[contains(text(),'CONTINUE')]")
	WebElement continuebtn;
	
	public WebElement LoginLink()
	{
		return LoginLink;
	}
	
	public WebElement emailID()
	{
		return emailId;
	}
	
	public WebElement continuebtn()
	{
		return continuebtn;
	}
}
