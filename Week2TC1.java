package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2TC1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver cd=new ChromeDriver();
		cd.get("http://leaftaps.com/opentaps");
		cd.manage().window().maximize();
		cd.findElement(By.id("username")).sendKeys("DemoSalesManager");
		cd.findElement(By.id("password")).sendKeys("crmsfa");
		cd.findElement(By.className("decorativeSubmit")).click();
		cd.findElement(By.linkText("CRM/SFA")).click();
		cd.findElement(By.linkText("Contacts")).click();
		cd.findElement(By.linkText("Create Contact")).click();
		cd.findElement(By.id("firstNameField")).sendKeys("Neeraja");
		cd.findElement(By.id("lastNameField")).sendKeys("Korra");
		cd.findElement(By.name("submitButton")).click();
		System.out.println(cd.findElement(By.id("viewContact_firstName_sp")).getText()+" "+cd.getTitle());
		cd.close();
		
		
		
		
		

	}

}
