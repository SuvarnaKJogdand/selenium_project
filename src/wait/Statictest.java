package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Statictest {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.discoveryplus.com/gb");
	Thread.sleep(3000);
	WebElement SignInButton = driver.findElement(By.xpath("//p[text()='Sign In']"));
	 SignInButton.click();
	
	
	
	

	}

}
