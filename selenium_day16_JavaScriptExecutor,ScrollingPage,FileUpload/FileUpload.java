package selenium_day16_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//single file upload -Test1.txt
		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("D:\\certificates\\171FA08053.pdf");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("171FA08053.pdf")){
			System.out.println("File uplode successfully");
		}
		else {
			System.out.println("Upload failed");
		}*/
		
		//Multiple files upload
		String file1="D:\\certificates\\171FA08053.pdf";
		String file2="D:\\certificates\\Autocad certificate.pdf";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int nofFilesUploaded=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		//validation1 -Number of files 
		if(nofFilesUploaded==2) {
			System.out.println("All files are uploaded");
			
		}else {
			System.out.println("Files are not uploaded or incorrect files uploaded");
		}
		
		//validate file names
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("171FA08053.pdf")
				&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Autocad certificate.pdf"))
		{
			System.out.println("File names matching ..");
					
		}else {
			System.out.println("Files are not matching");
		}
	
	}

}
