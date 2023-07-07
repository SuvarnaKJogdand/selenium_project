package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://signin.ebay.co.uk/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.co.uk%2F");
		//driver.findElement(By.name("userid")).sendKeys("suvarnakapil83@gmail.com");
		driver.get("https://www.argos.co.uk/account/login?clickOrigin=header:home:account");
		driver.findElement(By.name("emailAddress")).sendKeys("KapilJogi@gmail.com");
	}

}
