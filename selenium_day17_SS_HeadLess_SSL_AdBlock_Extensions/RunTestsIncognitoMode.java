package selenium_day17_SS_HeadLess_SSL_AdBlock_Extensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestsIncognitoMode {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
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
