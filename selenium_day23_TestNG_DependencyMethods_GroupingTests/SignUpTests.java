package selenium_day23_TestNG_DependencyMethods_GroupingTests;

import org.testng.annotations.Test;

public class SignUpTests {
	  @Test(priority=1, groups= {"regression"})
	  void signupByEmail() {
		  System.out.println("This is signup by email");
	  }
	  
	  @Test(priority=2, groups= {"regression"})
	  void signupByFacebook() {
		  System.out.println("This is signup by faebook");
	  }
	  
	  @Test(priority=3, groups= {"regression"})
	  void signupBytwitter() {
		  System.out.println("This is signup by twitter");
	  }

}
