package selenium_day_22_TestNGAnnotationsAndTypesofAssertions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*1)Login      ------> @BeforeMethod
2)Search   ------> @Test
3)Logout   ------> @AfterMethod
4)Login     ------->
5)Adv Search ---> @Test
6)Logout   ------->*/

public class AnnotationsDemo1 {
	
  @BeforeMethod
  public void login() {
	  System.out.println("This is login method");
  }
  
  @AfterMethod
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
