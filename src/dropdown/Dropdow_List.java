package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdow_List {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.uitestpractice.com/Students/Select");
		Thread.sleep(1000);
		WebElement countries = driver.findElement(By.id("countriesMultiple"));
		Select s=new Select(countries);
		
		//s.selectByIndex(1);
		//s.selectByValue("usa");
		//s.selectByVisibleText("United states of America");
		s.selectByIndex(0);
		s.selectByValue("england");
		s.selectByVisibleText("United states of America");
		Thread.sleep(1000);
		
		s.deselectAll();
		//driver.quit();
		//driver.close();
		 
		
		
		

	}

	
		
	

	
}
