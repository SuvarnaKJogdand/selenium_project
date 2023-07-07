package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateNaukariText {

	public static void main(String[] args) {
		String expText="Find your dream job now";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		//String actualText = driver.findElement(By.xpath("//h1[text()='Find your dream job now']")).getText();
		String actualText = driver.findElement(By.xpath("//h1[@class='qsb-title']")).getText();
		if(expText.equals(actualText))
		{
			
			System.out.println("actual text and expText are Matching and TC is Passed");
		}
		else
		{
			System.out.println("actual text and expText are not Matching and TC is failed");
		}
	}

}
