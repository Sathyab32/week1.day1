package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchLeaftapsFullInfo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sathya");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sat");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TestforTestleaf");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("ABCDEF");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("TestforTeastleafautomationSelenium");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("ImportantNote content");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Balakrishnan");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("B");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("250");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("xyz");

		// contact information
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("20");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sathyab32@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("961272");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("TestPerson");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/");

		// primary address
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("TestPerson");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("sasthrinagar");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600020");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("1234");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("CourseName");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("7th lane, adyar");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("TamilNadu");

		// click button on create lead
		driver.findElement(By.className("smallSubmit")).click();

		// get firstname
		String firstname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("The first name is :" + firstname);

		String Header = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println("The title of the page is :" + Header);

	}

}
