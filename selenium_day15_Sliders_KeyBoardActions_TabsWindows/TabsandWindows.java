package selenium_day15_Sliders_KeyBoardActions_TabsWindows;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsandWindows {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		//driver.switchTo().newWindow(WindowType.TAB); //opens new tab
		//selenium 4.x
		driver.switchTo().newWindow(WindowType.WINDOW); //opens new window
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		

	}

}
