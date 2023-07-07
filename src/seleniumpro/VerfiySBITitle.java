package seleniumpro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerfiySBITitle {

	public static void main(String[] args) {
		String expectedTitle="State Bank of India";
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.onlinesbi.sbi/");
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();

		System.out.println("This is SBI title:"+expectedTitle);
		System.out.println("This is SBI title:"+actualTitle);
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("expected and actual tiltle is match tc is passed");
			
		}
		else
		{
			System.out.println("expected and actual tiltle is not match tc is failed");
		}
		

	}

}
