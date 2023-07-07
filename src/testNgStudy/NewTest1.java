package testNgStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class NewTest1 {

	  @BeforeClass 
  public void LounchUrl() {
	  Reporter.log("lounch the url",true);
	  
  }
  @BeforeMethod
  public void SignInToEbay() {
	  Reporter.log("Signin to my ebay account",true);
	  
  }
  @Test
  public void SearchIteam()
  {
	  Reporter.log("search dress",true);
  }
  @Test
  public void AddIteamBusket()
  {
	  Reporter.log("Add summer dress in the busket",true);
  }

  @AfterMethod
  public void LogOut() {
	  Reporter.log("signout the account",true);
  }


  @AfterClass
  public void afterClass() {
  }

}
