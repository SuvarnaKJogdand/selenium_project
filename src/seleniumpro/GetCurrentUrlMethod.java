package seleniumpro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetCurrentUrlMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://meet.google.com/res-baqv-yeb");
		driver.manage().window().maximize();
		String myUrl = driver.getCurrentUrl();
		System.out.println("My Url:"+myUrl);

	}

}
