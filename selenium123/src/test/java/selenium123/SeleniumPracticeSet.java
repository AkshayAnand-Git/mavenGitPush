package selenium123;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SeleniumPracticeSet {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String url =driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		
		//driver.close();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
	WebElement x	=driver.findElement(By.className("_8esn"));	
	File source = x.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\AKSHAY ANAND\\eclipse-workspace\\selenium123\\errorshot\\ss.png");
	FileHandler.copy(source, destination);
	
		driver.quit();
		

	}

}
