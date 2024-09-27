package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreate {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         
         driver.get("https://en-gb.facebook.com/");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         driver.findElement(By.linkText("Create new account")).click();
         driver.findElement(By.name("firstname")).sendKeys("kousthuban");
         driver.findElement(By.name("lastname")).sendKeys("parthasarathy");
         driver.findElement(By.name("reg_email__")).sendKeys("mkpkousthuban@gmail.com");
         driver.findElement(By.name("reg_passwd__")).sendKeys("sd123ds");
         WebElement Day = driver.findElement(By.id("day"));
         Select d= new Select(Day);
         d.selectByIndex(21);
         WebElement Month = driver.findElement(By.id("month"));
         Select M= new Select(Month);
         M.selectByValue("4");
         WebElement Year = driver.findElement(By.id("year"));
         Select Y = new Select(Year);
         Y.selectByVisibleText("1993");
         driver.findElement(By.xpath("(//input[@id='sex'])[2]")).click();
         driver.close();
         }

}
