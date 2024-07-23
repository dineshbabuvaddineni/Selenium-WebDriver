package selenium_day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		
		// get(url) -opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(5000);
		
		//driver.close(); //close single window wherever the driver is focused
		driver.quit(); //close all the browser windows
		
		

	}

}
