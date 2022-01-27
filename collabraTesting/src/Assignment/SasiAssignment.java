package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SasiAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajayz\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.id("//input[@id='login1']")).sendKeys("hafeez1999@rediff.com");
		driver.findElement(By.id("//input[@id='password']")).sendKeys("Dinesh1999$$");
		driver.findElement(By.xpath("//input[@type='submit']"))
		
	}

}
