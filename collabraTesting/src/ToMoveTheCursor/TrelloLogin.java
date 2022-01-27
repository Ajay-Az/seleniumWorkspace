package ToMoveTheCursor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajayz\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 10);
		
		driver.get("https://trello.com/login");
		driver.findElement(By.id("user")).sendKeys("ajayzen11@gmail.com");
		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("password")));
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys("9071088426@aA");
		
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.xpath("//div[@title=\"WorkInSelenium\"]")).click();
		
		
		
		
		

	}

}
