package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAcc {



	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/.");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
			login.click();
			WebElement crmsfa = driver.findElement(By.id("button"));
			crmsfa.click();
			driver.findElement(By.linkText("Accounts")).click();
			driver.findElement(By.linkText("Create Account")).click();
			driver.findElement(By.id("accountName")).sendKeys("KousthuTestLeaf");
			driver.findElement(By.name("description")).sendKeys("Selenium  Automation Tester");
			WebElement Industry = driver.findElement(By.name("industryEnumId"));
			Select Cs= new Select(Industry);
			Cs.selectByVisibleText("Computer Software");
			WebElement Ownership = driver.findElement(By.name("ownershipEnumId"));
			Select corp= new Select(Ownership);
			corp.selectByVisibleText("S-Corporation");
			WebElement source = driver.findElement(By.name("dataSourceId"));
			Select Emp= new Select(source);
			Emp.selectByValue("LEAD_EMPLOYEE");
			WebElement Mark = driver.findElement(By.name("marketingCampaignId"));
			Select MC= new Select(Mark);
			MC.selectByIndex(6);
			WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
			Select ST= new Select(state);
			ST.selectByValue("TX");
			driver.findElement(By.className("smallSubmit")).click();
			String accountName = driver.findElement(By.id("viewAccount_accountName_sp")).getText();
            if (accountName.contains("KousthuTestLeaf")) {
                System.out.println("Account name is displayed correctly.");
            } else {
                System.out.println("Account name is not displayed correctly.");
            }
         
            driver.close();
		}
			
	}



