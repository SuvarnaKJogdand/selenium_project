package seleniumpro;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigateMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		//driver.get("https://en-gb.facebook.com/login.php");
		//.navigate().to():this method is use to open an application
		driver.navigate().to("https://en-gb.facebook.com/login.php");
		driver.navigate().to("https://paytm.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		

	}

}
