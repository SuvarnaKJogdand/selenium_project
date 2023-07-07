package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	



	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(1000);
		driver.switchTo().frame("iframeResult");
	   driver.findElement(By.xpath("//button[contains(text(),'Click me ')]")).click();
	   driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("(//a[@title='change Theme'])[1]")).click();
	   
	

	
		
	}

}
