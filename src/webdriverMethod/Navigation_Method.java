package webdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Method {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://paytm.com/recharge");
		
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().forward();
		//driver.navigate().back();
		driver.navigate().refresh();
		

	}

}
