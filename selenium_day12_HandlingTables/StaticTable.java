package selenium_day12_HandlingTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//1)Find total number of rows in a table
		int rows =driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
		
		//int rows=driver.findElements(By.tagName("tr")).size();
		System.out.println("Number of rows:"+rows);
		
		//2) Find total number of columns in a table.
		int cols=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//th")).size();
		
		//int cols=driver.findElements(By.tagName("th")).size();
		
		System.out.println("Number of columns"+cols);
		
		//3)Read data from specific row and column(Ex :6th row and second  column)
		
		//String bookName=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[6]//td[2]")).getText();
		//System.out.println(bookName);
		
		//4)Read data from all the rows and columns.
		// Print table headers
		//System.out.println("BookName" + "\t" + "Author" + "\t" + "Subject" + "\t" + "Price");

		// Loop through rows
		/*for (int r = 2; r <= rows; r++) {
		    // Loop through columns
		    for (int c = 1; c <= cols; c++) {
		        // Get the cell value using XPath
		        String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]")).getText();
		        
		        // Print the cell value with a tab delimiter, without a newline
		        System.out.print(value + "\t");
		    }
		    // Print a newline after each row
		    System.out.println();
		}*/

		
		//5) Print the book names whose author is Mukesh
		/*for(int r=2;r<rows;r++) {
			String authorName=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[2]")).getText();
			
			if(authorName.equals("Mukesh")) {
				String BookName=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[1]")).getText();
				System.out.println(BookName+"\t"+authorName);
			}
		}*/
		
		
		//6) Find Total Price of all the books
		int total=0;
		for(int r=2;r<=rows;r++) {
			String price=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[4]")).getText();
			total=total+Integer.parseInt(price);
			
		}
		
		System.out.println("Total price of the books:"+total);
		
		

	}

}
