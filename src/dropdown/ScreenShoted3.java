package dropdown;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShoted3 {

	
	public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
       File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       String random = RandomString.make(2);
       File dist=new File("C:\\Users\\suvar\\Desktop\\18 feb\\screenshots selenium\\myScreenshort"+random+".png");
       
       FileHandler.copy(src, dist);
	}

}
