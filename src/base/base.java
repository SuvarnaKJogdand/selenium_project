package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public  class base {
	  WebDriver driver;
	//driver and browser setup
	 
	public void launchBrowser() 
	{
	 ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.policybazaar.com/");
	Reporter.log("launching Browser", true);
}
	public void closeBrowser()
	{
		Reporter.log("Closing Browser",true);
	driver.quit();
	}

}
