package selenium_day6;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		
		// get(url) -opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		// getTitle() -returns title of the page.
		System.out.println(driver.getTitle()); //OrangeHRM
		
		// getCurrentUrl() - Returns URL of the page
		//System.out.println(driver.getCurrentUrl()); //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		// getPageSource() - returns source code of the page
		//System.out.println(driver.getPageSource());
		
		// getWindowHandle() -returns ID of the single browser window
		// System.out.println(driver.getWindowHandle()); //first launch :E9441D2273ECA5FDDB3DE3618657B621
													  //Second Launch:6120C1E3D48856856A2D7B2C3D809D63
		
		// getWindowHandles() - return ID's of the multiple browser windows
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		// NoSuchElementException -- it will get when dom is not fully loaded.
		
		Set<String> windowids=driver.getWindowHandles();
		System.out.println(windowids); //[12ED04E425915C1C05848421BFB7D6B3, 3E982EC1B0A286345FCDF23D84069BC6]
		
		
		

	}

}
