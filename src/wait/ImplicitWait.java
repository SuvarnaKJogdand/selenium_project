package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.com/gb");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		WebElement SignInButton = driver.findElement(By.xpath("//p[text()='Sign In']"));
		
		 SignInButton.click();
	}

}
