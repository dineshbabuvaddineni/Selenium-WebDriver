package selenium_day1;

/*Test Case
 * 1)Launch the browser
 * 2)Open URL https://demo.opencart.com/
 * 3)Validate title should be "your state".
 * 4)Close the browser
 */

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "D:\\Automation WorkSpaces\\SeleniumWorkspace\\SeleniumWebDriver\\chromedriver.exe");
			
		//1)Launch the browser
		//ChromeDriver driver =new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		//2)Open URL https://demo.opencart.com/
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
		
//		driver.close();Version 126.0.6478.127
//		
	}

}
