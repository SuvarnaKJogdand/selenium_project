package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {
	public static void main (String []args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.argos.co.uk/account/login?clickOrigin=header:home:account");
		//driver.findElement(By.cssSelector("input[name=emailAddress]")).sendKeys("kiara@gmail.com");
		//driver.findElement(By.cssSelector("input#email")).sendKeys("bye");
		driver.findElement(By.cssSelector("input.inputtext[id=email]")).sendKeys("bye");
	}}

