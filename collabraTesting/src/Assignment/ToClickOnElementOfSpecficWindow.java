package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnElementOfSpecficWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajayz\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://translate.google.com/");
		
		Thread.sleep(2000);
		WebElement a = driver.findElement(By.xpath("//textarea[@aria-label=\"Source text\"]"));
		a.clear();
		a.sendKeys("Kannada",Keys.CONTROL+"a");
		
	
		
		


	}

}
