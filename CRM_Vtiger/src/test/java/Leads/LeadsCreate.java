package Leads;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LeadsCreate {

	public static void main(String[] args) throws InterruptedException {
		
		// open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//login crmVtiger
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		WebElement login = driver.findElement(By.name("user_name"));
		login.sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("manager");
		driver.findElement(By.id("submitButton")).click();
		
		//open leads
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.cssSelector("img[title= 'Create Lead...']")).click();
		Thread.sleep(5000);
		
		//filling form
		WebElement sir = driver.findElement(By.name("salutationtype"));
		Select x = new Select(sir);
		x.selectByValue("Mr.");
		
		String firstname = "Akshay";
		String lastname = "Anand";
		String company = "BlackRock";
		String savedName;
		String companyName;
		
		driver.findElement(By.name("firstname")).sendKeys(firstname);
		driver.findElement(By.name("lastname")).sendKeys(lastname);
		driver.findElement(By.name("company")).sendKeys(company);
		driver.findElement(By.name("designation")).sendKeys("Software Test Engineer");
		
		WebElement lead = driver.findElement(By.name("leadsource"));
		Select y = new Select(lead);
		y.selectByValue("Trade Show");
		
		WebElement industry = driver.findElement(By.name("industry"));
		Select z = new Select(industry);
		z.selectByValue("Biotechnology");
		
		WebElement rrating = driver.findElement(By.name("rating"));
		Select r = new Select(rrating);
		r.selectByValue("Acquired");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		// verification process
		
		savedName = driver.findElement(By.id("dtlview_First Name")).getText();
		
		companyName = driver.findElement(By.id("dtlview_Company")).getText();
		
		System.out.println("saved first name is "+savedName);
		System.out.println("saved company name is "+companyName);
		
		if(firstname.equals(savedName) && company.equals(companyName))
		{
			System.out.println(" lead is created and verified");
		}
		else
		{
			System.out.println(" Sorry....lead creation is failed");
		}
		
		
			Thread.sleep(3000);
			
			//logout
			WebElement log = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
			
			Actions act = new Actions(driver);
			act.moveToElement(log).click().build().perform();
			WebElement signout = driver.findElement(By.linkText("Sign Out"));
			signout.click();
			
			Thread.sleep(3000);	
				
			driver.quit();
					
			}
				
	}


