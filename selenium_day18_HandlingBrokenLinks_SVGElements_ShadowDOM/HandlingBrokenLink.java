package selenium_day18_HandlingBrokenLinks_SVGElements_ShadowDOM;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrokenLink {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		//capture all the links from website
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+ links.size());
		
		int noOfBrokenLinks=0;
		for(WebElement linkElement :links) {
			String hrefattrValue=linkElement.getAttribute("href");
			if(hrefattrValue==null || hrefattrValue.isEmpty()) {
				System.out.println("href attribute value is null or empty.so Not possible check");
				continue;
			}
			
			//hit url to server
			try 
			{
				URL linkURL=new URL(hrefattrValue); //converted href value from string to URL format
				HttpURLConnection conn=(HttpURLConnection) linkURL.openConnection();//open connection to the Server
				conn.connect();
				
				if(conn.getResponseCode()>=400) {
					System.out.println(hrefattrValue+"======>Broken link");
					noOfBrokenLinks++;
					
				}else {
					System.out.println(hrefattrValue+"======>Not a broken link");
				}
				
			}catch(Exception e) {
				
			}
		}
		System.out.println("Number of broken Links:"+ noOfBrokenLinks); 
		
		
		

	}

}
