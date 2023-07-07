package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorUserAndPass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");

	}

}
