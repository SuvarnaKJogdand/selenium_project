package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/login.php");
	Thread.sleep(1000);
	String myText = driver.findElement(By.xpath("//div[text()='Log in to Facebook']")).getText();
	System.out.println("the text is "+myText);
	
		


	}

}
