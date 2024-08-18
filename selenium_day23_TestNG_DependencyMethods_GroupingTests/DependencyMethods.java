package selenium_day23_TestNG_DependencyMethods_GroupingTests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
	
	WebDriver driver;
	
	@Test(priority=1)
	void openapp() {
		Assert.assertTrue(true);
		
	}
	
	//if the the dependency method pass respective dependent method also will pass and
	//Incase if the dependency method fails respective dependent method will be skipped.
	
	@Test(priority=2, dependsOnMethods = {"openapp"})
	void login() {
		Assert.assertTrue(true);
	}
	
	
	@Test(priority=3, dependsOnMethods= {"login"})
	void search() {
		Assert.assertTrue(false);
		
	}
	
	@Test(priority=4, dependsOnMethods= {"login","search"})
	void advsearch() {
		Assert.assertTrue(true);
		
	}
	
	@Test(priority=5, dependsOnMethods= {"login"})
	void logout() {
		Assert.assertTrue(true);
		
	}

}
