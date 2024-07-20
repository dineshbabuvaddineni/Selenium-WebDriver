package selenium_day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
		
		//name
//		driver.findElement(By.name("email")).sendKeys("9182279112");
		
		//id
//		driver.findElement(By.id("email")).sendKeys("9182279112");
		
		//Linktext & partial link text
		//Linktext - preferable
		//partial link text - not preferable it may match with other elements
		//Table Tablets --in this case link text() is preferable
		// submit send - Partial Link text()
		
		//linktext
//		driver.findElement(By.linkText("Tablets")).click();
		
		//partial link text
//		driver.findElement(By.partialLinkText("Table")).click();
		
		//TagName
		//Class
		
		//TagName and Class name we will use to locate multiple web elements or group of web elements not for specific web elements.
		//we cannot use for locating single web element.
		
//		TagName:
			
//		TagName can be same for multiple elements 
//		multiple div tags having same tag
//		multiple images having similar tags
		
//		Class:
			
//		class is nothing but a category of elements
//		for multiple check boxes - value of class attribute is same for all the elements.
//		for multiple radio buttons
//		for multiple drop downs
		
		// what is requirement?
		//sometimes we need to do validations on group of webelements
		
		//ex: we need to find number of links present in the web page
		
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
//		List<WebElement> headerLinks=driver.findElements(By.className("cb-hm-mnu-itm"));
//		System.out.println("Total number of header links:"+headerLinks.size());
		
//		TagName
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links present on the webpage: "+links.size());
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("Total Number of images:"+images.size());
		
		driver.close();
				
	}

}
