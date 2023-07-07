package testNgStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class my1stTestNgProg {
  @Test
  public void myMethod() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");

	  
  
}
@Test
  public void myMethod1()
  {
	  Reporter.log("myMethod1 is running",true);
  }
@Test
public void MyMethod2()
{
	Reporter.log("myMethod2 is running",true);
}
@Test
public void MyMethod3()
{
	Reporter.log("myMethod3 is running",true);
}
@Test
public void MyMethod4()
{
	Reporter.log("myMethod4 is running",true);
}
}
