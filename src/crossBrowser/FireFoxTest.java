package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTest {
  @Test
  public void f() {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://mbasic.facebook.com/");
  }
}
