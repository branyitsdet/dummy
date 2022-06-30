package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPage 
{
	private RemoteWebDriver driver;
	
	@FindBy(name="email")
	private WebElement uname;
	
	@FindBy(name="pass")
	private WebElement pwd;
	
	public FbLoginPage(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	

}
