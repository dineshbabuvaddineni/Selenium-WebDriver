package selenium_day22_TestNGAnnotationsAndTypesofAssertions.copy;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotation3 {
  @Test
  public void pqr () {
	  System.out.println("This is pqr method from Annotation3");
  }
  
  @BeforeSuite
  void bs() {
	  System.out.println("This is BeforeSuite method .....");
  }
  
  @AfterSuite
  void as() {
	  System.out.println("This is Aftersuite method .....");
  }
}
