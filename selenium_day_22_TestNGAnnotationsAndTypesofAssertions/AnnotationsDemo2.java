package selenium_day_22_TestNGAnnotationsAndTypesofAssertions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*1)Login  ------> @BeforeClass
2)Search   ------> @Test
3)Adv Search ----> @Test
4)Logout   ------->@AfterClass*/

public class AnnotationsDemo2 {
	
  @BeforeClass
  public void login() {
	  System.out.println("This is login method");
  }
  
  @AfterClass
  public void logout() {
	  System.out.println("This is logout method");
	  
  }  
  @Test(priority=1)
  void search() {
	  System.out.println("This is search method");
	  
  }
  
  @Test(priority=2)
  void advancedsearch() {
	  System.out.println("This is advanced search method");
	  
  }
}
