package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.argos.co.uk/account/login?clickOrigin=header:home:account");
		driver.findElement(By.name("emailAddress")).sendKeys("kapiljogi@gmail.com");
		driver.findElement(By.id("current-password")).sendKeys("abcd1286");
		   
		//locators class
		
		//driver.findElement(By.className("form-control")).sendKeys("hello");

	}

}
