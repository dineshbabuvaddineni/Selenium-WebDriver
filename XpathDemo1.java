package selenium_day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//XPath with single attribute
			//driver.findElement(By.xpath("//input[@placeholder='Search store']")).sendKeys("T-Shirts");
		
		//Xpath with multiple attributes
			//driver.findElement(By.xpath("//input[@name=\"q\"][@placeholder=\"Search store\"]")).sendKeys("Tshirts");
		
		//Xpath with 'and' operator
			//driver.findElement(By.xpath("//input[@name='q' and @placeholder='Search store']")).sendKeys("Shirt");
		
		//Xpath with 'or' operator
			//driver.findElement(By.xpath("//input[@name='q' or @placeholder='Search store']")).sendKeys("Shirt");
		
		//XPath with text() - inner text
			//driver.findElement(By.xpath("//*[text()=' Electronics ']")).click();
			//boolean displaystatus =driver.findElement(By.xpath("//*[text()='Featured products']")).isDisplayed();
			//System.out.println(displaystatus);
		
			//String value=driver.findElement(By.xpath("//*[text()='Featured products']")).getText();
			//System.out.println(value);
		
		//XPath with contains() method - it will verify partial text value of element.
			//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Shirt");
			
		//Xpath with starts-with()
			//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Shirt");
			
		//Chained Xpath
			Boolean text=driver.findEleemnt(By.xpath("//div[@class='page home-page']/div/div[5]/div/strong")).isDisplayed();
	
		

	}

}
