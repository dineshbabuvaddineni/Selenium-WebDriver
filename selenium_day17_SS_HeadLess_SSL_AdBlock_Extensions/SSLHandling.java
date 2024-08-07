package selenium_day17_SS_HeadLess_SSL_AdBlock_Extensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLHandling {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);  //accepts SSL Certificates
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://expired.badssl.com/");
		System.out.println("Title of the page:"+driver.getTitle()); //privacy error
		
	}

}
