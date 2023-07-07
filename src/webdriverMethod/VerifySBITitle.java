package webdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySBITitle {

	public static void main(String[] args) {
		
		String  expectedTitle="Online Recharge - Online Mobile Recharge & Prepaid Recharge Plans";
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/recharge");
		String actualTitle = driver.getTitle();
		
		System.out.println("actual title"+actualTitle);
		System.out.println("expected title"+ expectedTitle);
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("excpected & actual title are matching and TC is passed");
		}
		else
		{
			System.out.println("excpected & actual title are not matching and TC is failed");
		}
	}

}
