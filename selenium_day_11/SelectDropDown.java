package selenium_day_11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		//1) Select Drop
		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='country']"));
		Select drpCountry=new Select(drpCountryEle);
		
		//Selecting options from drop down
		//SelectByVisibleText()
		//SelectByValue()
		//SelectByIndex()
		
		//drpCountry.selectByVisibleText("France");
		//drpCountry.selectByValue("australia");
		//drpCountry.selectByIndex(7);
		  
		// Capture the options from dropdown
		  List<WebElement> Options=drpCountry.getOptions();
		  System.out.println("Number of options in a dropdown: "+Options.size()); //10
		  
		  //Printing the options
		  /*for(int i=0; i<Options.size();i++) {
			  System.out.println(Options.get(i).getText());
		  }*/
		  
		  //enhanced for loop
		 for(WebElement Option :Options) {
			 System.out.println(Option.getText());
		 }
		
		
		

	}

}
