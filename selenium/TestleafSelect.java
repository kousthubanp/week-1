package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestleafSelect {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
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
	WebElement dd = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select obj=new Select(dd);
	obj.selectByIndex(4);
	WebElement marketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select MC = new Select(marketingCampaign);
	MC.selectByVisibleText("Automobile");
	WebElement ownerShip = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select ownership= new Select(ownerShip);
	ownership.selectByValue("OWN_CCORP");
	WebElement submit= driver.findElement(By.className("smallSubmit"));
	submit.click();
	driver.close();
	
	
	}
	

}
