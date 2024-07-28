package selenium_day_11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click(); //opens dropdown options
		
		//1) Select single option
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//2) Capture all the options and find out size
		List<WebElement> Options=driver.findElements(By.xpath("//ul[contains(@class,multiselect)]//label"));
		
		System.out.println(Options.size());
		
		//3) Printing Options from drop down
		
		/*for(WebElement option :Options) {
			System.out.println(option.getText());
		}*/
		
		
		//4) Select Multiple Options
		
		for(WebElement op: Options) {
			String option=op.getText();
			
			if(option.equals("java") || option.equals("Python")|| option.equals("MySQL") ){
				op.click();
			}
		}
		
		
		

	}

}
