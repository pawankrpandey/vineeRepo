package reposetories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FCHomePage {
	
	
	WebDriver driver;
	
	public FCHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id="search_box")
	WebElement SrchText;
	
	@FindBy(className="search-button")
	WebElement srchbtn;
	
	public WebElement search()
	{
		
		return SrchText;
		
	}
	
	public WebElement submit()
	{
		return srchbtn;
	}
	

}
