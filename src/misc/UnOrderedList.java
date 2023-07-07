package misc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderedList {

	

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//div[text()='Reject all']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	driver.findElement(By.name("q")).sendKeys("honda");
	Thread.sleep(1000);
	List<WebElement>searchResult= driver.findElements(By.xpath("(//ul[@class='erkvQe'])[1]/li"));

	for(WebElement sr:searchResult)
	{
		System.out.println(sr.getText());
	}
	for(WebElement sr:searchResult) {
		String expectedResult = "honda city";
		Thread.sleep(1000);
		if(expectedResult.equals(sr.getText())) {
			sr.click();
			break;
		}
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	driver.findElement(By.linkText("Images")).click();
	driver.findElement(By.xpath("//div[text()='Reject all']")).click();
	driver.findElement(By.name("q")).sendKeys("honda");
	((WebElement) driver).click();

	}

}
