package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2TC2 {

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
		cd.findElement(By.linkText("Find Contacts")).click();
		cd.findElement(By.linkText("Email")).click();
		cd.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
		cd.findElement(By.className("x-btn-text")).click();
		cd.close();
		
		
	}

}
