package testNgStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TesstNgBank {
  @Test
  public void ValidateAccountBalance() {
	  Reporter.log("Validate account balance",true);
  }
  @BeforeMethod
  public void login() {
	 Reporter.log("login to NationwideBank",true);
  }

  @AfterMethod
  public void Logout() {
	  Reporter.log("Log out the account",true);
  }

  @BeforeClass
  public void LounchUrl() {
	  Reporter.log("Lounch the browser",true);
  }

  @AfterClass
  public void CloseUrl() {
	  Reporter.log("close the browser",true);
  }

}
