package selenium_day_11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		driver.manage().window().maximize();
		
		//Login Steps
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//Clicked on PIM
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click(); //PIM
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]")).click();
		
		//Clicked on drop down
		//driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();
		
		Thread.sleep(5000);
		//count number options
		List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println(options.size());
		
		//printing options
		
		for(WebElement opt: options) {
			System.out.println(opt.getText());
		}
		
		

	}

}
