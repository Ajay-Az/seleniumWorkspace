package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetTheHeightAndWidthOfTheWindows {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajayz\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
	
		
		driver.manage().window().setSize(new Dimension(1000,520));
		
	}
}
		
		
		
	
		
		
