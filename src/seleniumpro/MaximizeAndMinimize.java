package seleniumpro;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MaximizeAndMinimize {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login.php");
		driver.manage().window().maximize();
		driver.manage().window().minimize();


	}

}
