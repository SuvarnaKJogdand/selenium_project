package testNgStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestngEbay {
	
	@BeforeMethod
	public void LoginToEbay() {
		System.out.println("Login to ebay");
		
	}

  @Test
  public void ValidateEmail() {
	  System.out.println("enter valid user name or email");
  }
  @Test
  public void ValidatePassword()
  {
	  System.out.println("validate password");
  }
  @Test
  public void SearchItem()
  {
	  System.out.println("search iphone 14 pro max");
  }
 
 
  @AfterMethod
  public void LogOut() {
	  System.out.println("Logout the ebay account");
  }
  @BeforeClass
  public void lounchUrl() {
	System.out.println("lounch the Url");
  }
  

  @AfterClass
  public void CloseUrl() {
	  System.out.println("close the Url");
  }

}
