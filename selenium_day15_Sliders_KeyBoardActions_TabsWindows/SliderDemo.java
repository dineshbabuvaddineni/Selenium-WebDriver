package selenium_day15_Sliders_KeyBoardActions_TabsWindows;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		//Min slider
		WebElement min_slider=driver.findElement(By.xpath("//*[@id='slider-range']/span[1]"));
		System.out.println("Default location of the min slider :"+min_slider.getLocation()); //getX() and getY() --> (58,249)=(x,y)
		act.dragAndDropBy(min_slider, 100, 250).perform();
		System.out.println("Location of the min slider after moving:"+min_slider.getLocation());//(157,249)
		
		//Max slider
		WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		System.out.println("Default location of the max slider :"+max_slider.getLocation()); //getX() and getY() --> (58,249)=(x,y)
		act.dragAndDropBy(max_slider, -100, 250).perform();
		System.out.println("Location of the max slider after moving:"+max_slider.getLocation());//(157,249)
		//getX()
		//getY()
		
	}

}
