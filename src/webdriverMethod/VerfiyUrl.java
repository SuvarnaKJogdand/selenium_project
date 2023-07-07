package webdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerfiyUrl {

	public static void main(String[] args) {
		String expectedUrl = "https://paytm.com/recharge";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/recharge");
		String actualUrl = driver.getCurrentUrl();
		System.out.println("expected Url"+expectedUrl);
		System.out.println("actual Url"+actualUrl);
		if(expectedUrl.equals(actualUrl))
		{
			System.out.println("Expected and actual url are matching and TC is passed");
			
		}
		else
		{
			System.out.println("Expected and actual url are not matching and TC is failed");
		}

	}

}
