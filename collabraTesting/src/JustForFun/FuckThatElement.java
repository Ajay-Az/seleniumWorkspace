package JustForFun;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FuckThatElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajayz\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.mtlnovel.com/");
		
		Thread.sleep(1000);
		
		driver.findElement().sendKeys("Martial");
		}
		
		
	

}

