package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriver {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("praveen");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar");
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sec = new Select(sourceDD);
		sec.selectByIndex(4);
		WebElement sourceDD1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sec1 = new Select(sourceDD1);
		sec1.selectByVisibleText("Automobile");
		WebElement sourceDD2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sec2 = new Select(sourceDD2);
		sec2.selectByValue("OWN_CCORP");
		driver.findElement(By.name("submitButton")).click();
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
