package utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebUtilities 
{
	private RemoteWebDriver driver;
	
	public WebUtilities(RemoteWebDriver driver)
	{
		driver=null;
	}
	
	public RemoteWebDriver openBrowser(String bn)
	{
		if(bn.equalsIgnoreCase("chrome")) 
		{
			driver=new ChromeDriver();
			WebDriverManager.chromedriver().setup();
		}
		else 
		{
			driver=new FirefoxDriver();
			WebDriverManager.firefoxdriver().setup();
		}
		
		return(driver);
		
	}
	
	public void openSite(RemoteWebDriver driver, String url)
	{
		driver.get(url);
	}
	
	public void closeSite(RemoteWebDriver driver)
	{
		driver.close();
	}
		
}
