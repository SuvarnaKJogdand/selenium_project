package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Index_locators {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://neostox.com/sign-in");
	Thread.sleep(1000);
	//contains (non brackable space)
	//driver.findElement(By.xpath("//p[contains(text(),' Live Stocks trading with ')]")).click();
	Thread.sleep(2000);
	//xpath with index
	driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("7419932789");
	driver.findElement(By.xpath("(//a[text()='Sign In'])[2]")).click();
	}

}
