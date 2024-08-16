package selenium_day_22_TestNGAnnotationsAndTypesofAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertionvsSoftAssertion {
  @Test
  void test_hardassertions() {
	  System.out.println("Testing.......");
	  System.out.println("Testing.......");
	  
	  Assert.assertEquals(1, 2); //hard assertion
	  
	  System.out.println("Testing.......");
	  System.out.println("Testing.......");
	  
  }
  
  @Test
  void test_softassertion() {
	  System.out.println("Testing.......");
	  System.out.println("Testing.......");
	  
	  SoftAssert sa= new SoftAssert();
	  sa.assertEquals(1, 2);  //soft assertion  --> here methods are not static 
	  
	  System.out.println("Testing.......");
	  System.out.println("Testing.......");
	  
	  sa.assertAll();  //mandatory
	  
	  // objects only creates in main method but we can create a variable
	  
  }
  
  
}
