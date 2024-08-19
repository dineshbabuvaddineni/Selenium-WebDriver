package selenium_day25_TestNG_Listeners_ExtentReports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
	
	public ExtentSparkReporter sparkReporter; //UI of the report
	public ExtentReports extent; //populate common information on the report(tester name, Os used, browsername, project name , module name, environment name)
	public ExtentTest test; //creating test case entries in the report and update status of the test methods.
	
	public void onStart(ITestContext context) {
			sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+ "/reports/myReport.html");//specific 
			
			sparkReporter.config().setDocumentTitle("Automation Report"); //Title of report
			sparkReporter.config().setReportName("Functional Testing"); //name of the report
			sparkReporter.config().setTheme(Theme.DARK);
			
			extent=new ExtentReports();
			extent.attachReporter(sparkReporter);
			
			extent.setSystemInfo("Computer Name", "localhost");
			extent.setSystemInfo("Environment", "QA");
			extent.setSystemInfo("Tester Name", "Dinesh Babu");
			extent.setSystemInfo("os", "Windows10");
			extent.setSystemInfo("Browser Name", "Chrome");
			
	}
	
	public void onTestSuccess(ITestResult result) {
	    test = extent.createTest(result.getName()); //create a new entry in the report
	    test.log(Status.PASS, "Test case PASSED is :" +result.getName()); //update status pass/fail/skip
	    
	  }
	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName()); //create a new entry in the report
	    test.log(Status.FAIL, "Test case FAILED is :" +result.getName()); //update status pass/fail/skip
	    test.log(Status.FAIL, "Test Case Failed cause is : " + result.getThrowable()); //returns the main error.
	    
	  }
	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test caseSKIPPED is :" +result.getName());
	}
	
	 public void onFinish(ITestContext context) {
		    extent.flush(); // it will write all the above logs into report
		  }
	
	

}
