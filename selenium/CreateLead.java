package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/.");
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        WebElement login = driver.findElement(By.className("decorativeSubmit"));
        	login.click();
        	WebElement crmsfa = driver.findElement(By.id("button"));
        	crmsfa.click();
        	WebElement lead = driver.findElement(By.linkText("Leads"));
        	lead.click();
        	WebElement createlead = driver.findElement(By.linkText("Create Lead"));
        	createlead.click();
        	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("kousthuOwn");
        	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("kousthuban");
        	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("parthasarathy");
       driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("kousthuCorp");
       WebElement submit= driver.findElement(By.className("smallSubmit"));
   	submit.click();
String title = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
if (title.equals("kousthuCorp")) {
    System.out.println("Title is displayed correctly.");
} else {
    System.out.println("Title is not displayed correctly.");
	}
driver.close();
	}

	}

