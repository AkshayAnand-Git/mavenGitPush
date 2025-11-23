package selenium123;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ZomatoScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// TODO Auto-generated method stub
		driver.get("https://www.zomato.com/");
		TakesScreenshot tks = (TakesScreenshot) driver;
		File source = tks.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\AKSHAY ANAND\\eclipse-workspace\\selenium123\\errorshot\\ss2.png");
		FileHandler.copy(source,destination);
		Thread.sleep(5000);
		driver.quit();
	}

}

