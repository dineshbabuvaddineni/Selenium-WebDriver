package selenium_day9;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		// 1) Normal alert with OK Button.
		/*driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		Alert myalert=driver.switchTo().alert();
		String alertname=myalert.getText();
		System.out.println(alertname);
		if(alertname.equals("I am a JS Alert")) {
			myalert.accept();
		}*/
		
		//2) Confirmation Alert -OK & Cancel Button.
		/*driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		Thread.sleep(5000);
		
		//driver.switchTo().alert().accept(); //close alert with OK button
		driver.switchTo().alert().dismiss(); //close alert using cancel button */
		
		//3) Prompt alert -Input box
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(5000);
		
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("Welcome");
		myalert.accept();
		
		
		
		

		
		

	}

	private static Alert myalert() {
		// TODO Auto-generated method stub
		return null;
	}

}
