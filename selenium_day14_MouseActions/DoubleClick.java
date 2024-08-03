package selenium_day14_MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		//switch inside frame
		driver.switchTo().frame("iframeResult");
		WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		//clear the input box
		box1.clear();							//clears box1
		box1.sendKeys("WELCOME");
		
		
		//Double click action on the button
		Actions act=new Actions(driver);
		act.doubleClick(button).perform();
		
		//validation :box2 should contains
		String text=box2.getAttribute("value");
		System.out.println(text);
		
		if(text.equals("WELCOME")) {
			System.out.println("Same content is copied");
		}else {
			System.out.println("Content copied is different");
		}
		
		

	}

}
