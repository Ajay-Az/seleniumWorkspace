package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseAllChildWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajayz\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com");
		
		String ParentWindowId = driver.getWindowHandle();
		Set<String> ChildWindowsIds = driver.getWindowHandles();
		ChildWindowsIds.remove(ParentWindowId);
		
		for(String WindowId : ChildWindowsIds) {
			driver.switchTo().window(WindowId);
			driver.close();
			
		}
		
}
}
