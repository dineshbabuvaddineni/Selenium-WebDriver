package selenium_day8;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> WindowIDS=driver.getWindowHandles();
		
		for(String windid :WindowIDS) {
			String title=driver.switchTo().window(windid).getTitle();
			System.out.println(title);
			
			if(title.equals("OrangeHRM"))
			{
				driver.close();
				break;
			}
			
		}
		

	}

}
