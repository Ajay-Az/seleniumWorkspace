package IdentifingTheElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifingTheElementsUsingLocators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ajayz\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
//		driver.findElement(By.id("username")).sendKeys("Ajay");
		driver.findElement(By.linkText("<label id=\"keepLoggedInLabel\" for=\"keepLoggedInCheckBox\" style=\"cursor: default;\">Keep me logged in</label>")).sendKeys("AjayZen");
		
		

	}

}
