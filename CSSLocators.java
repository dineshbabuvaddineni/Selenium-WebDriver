package selenium_day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// tag id  tag#id
		
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
//		another way of writing the above statement without tag
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		
		// tag class tag.classname
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("shirts");
//		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("shirts");
		
		//tag[attribute="value"]
//		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Shirts");
//		driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Shirts");
//													or
//		driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("Shirts");
		
		//tag.className[attribute='value']
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Shirts");
//		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Shirts");
		
		

	}

}
