package selenium_day8;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> WindowIDS=driver.getWindowHandles();
		
		
		//Approach1
		/*List<String> windowList =new ArrayList(WindowIDS);
		
		String parentID= windowList.get(0);
		String ChildID= windowList.get(1);
		
		System.out.println(driver.getTitle()); //OrangeHRM
		
		//switch to child window
		driver.switchTo().window(ChildID);
		System.out.println(driver.getTitle()); //Human Resources Management Software | OrangeHRM
		
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());*/
		
		//Approach 2
		for(String WindId :WindowIDS)
		{
			String title=driver.switchTo().window(WindId).getTitle();
			
			if(title.equals("OrangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
				//some validation on the parent window
			}
			else {
				System.out.println(driver.getCurrentUrl());
				
			}
		}
		

	}

}
