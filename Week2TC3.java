package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2TC3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("dxc");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Neeraja");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Korra");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/06/1987");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+65");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("21");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("123");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("neeraja.korra@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("93229880");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Prasad");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://www.url.com");
		
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Neeraja");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Tampines street21");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Singapore");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("520285");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("265");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Korra");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("simei21");
		
		
		WebElement provinceDD=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select=new Select(provinceDD);
		select.selectByVisibleText("Minnesota");
		
		WebElement countryDD=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select select1=new Select(countryDD);
		select1.selectByVisibleText("United States");
		
		System.out.println(driver.findElement(By.id("createLeadForm_firstName")).getText());
		
		driver.findElement(By.name("submitButton")).click();
		
		

		String str=driver.getTitle();
		
			System.out.println(str);
		
		
		
	}

}
