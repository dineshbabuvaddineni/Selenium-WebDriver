package selenium_day17_SS_HeadLess_SSL_AdBlock_Extensions;

/*Test Case
 * 1)Launch the browser
 * 2)Open URL https://demo.opencart.com/
 * 3)Validate title should be "your state".
 * 4)Close the browser
 */

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {

		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=new");//setting for headless mode of execution
		Thread.sleep(5000);
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.zomato.com/");  
		
		
		String expected="Zomato";
		String actual=driver.getTitle();
		
		if(actual.equals("Zomato")){
			
			System.out.println("Test Passed");
			System.out.println(actual);
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		driver.quit();
	
	}

}
