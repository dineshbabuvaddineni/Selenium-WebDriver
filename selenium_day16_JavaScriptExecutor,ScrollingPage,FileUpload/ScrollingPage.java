package selenium_day16_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//1)Scroll down page by pixel Number
		
		//js.executeScript("window.scrollBy(0,1700)", "");
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//2) Scroll page till element is visible
		//WebElement ele=driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		//js.executeScript("arguments[0].scrollIntoView();", ele);
		//System.out.println(js.executeScript("return window.pageYOffset;")); //2289
		
		//3)scroll page till end of the page.
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));//2426
		
		Thread.sleep(5000);
		
		//scrolling upto initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		//Incase of horizontal bar
		//instead of "scrollHeight" we have to use "scrollWidth" and pageXOffset Instead of pageYOffset
		
		
		
		

	}

}
