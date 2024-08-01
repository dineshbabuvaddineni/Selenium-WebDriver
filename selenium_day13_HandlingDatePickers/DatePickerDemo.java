package selenium_day13_HandlingDatePickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {
	static void selectFutureDate(WebDriver driver, String year,String month, String date) {
		//select month & year
		while(true) {
			String currentMonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); //actual month
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();//actual Year
			
			if(currentMonth.equals(month) && currentYear.equals(year))
			{
				break;
			}		
			
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //Next			
		
		}
		//select date
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td/a"));
		for(WebElement dt : allDates) {
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
			
			
		}
	}
	
	static void selectPastDate(WebDriver driver, String year,String month, String date) {
		//select month & year
		while(true) {
			String currentMonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); //actual month
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();//actual Year
			
			if(currentMonth.equals(month) && currentYear.equals(year))
			{
				break;
			}		
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //previous			
		
		}
		//select date
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td/a"));
		for(WebElement dt : allDates) {
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
			
			
		}
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		WebElement frameD=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameD);
		// Method1: Using SendKeys() 
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("07/04/2024"); //mm/yy/yyyy
		
		//Method2: Using date picker
		
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); //opens date picker
		
		//expected data
		String year = "2021";
		String month ="May";
		String date ="16";
		
		//selectFutureDate(driver,year,month,date);
		selectPastDate(driver,year,month,date);
		
	}

}
