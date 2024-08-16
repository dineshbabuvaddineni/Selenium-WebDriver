package selenium_day22_TestNGAnnotationsAndTypesofAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
  @Test
  public void testTitle() {
	  String exp_title="Opencart";
	  String act_title="Opencart";
	  
	  /*if(exp_title.equals(act_title)) {
		  System.out.println("Test Passed");
	  }else {
		  System.out.println("Test Failed");
	  }*/
	  
	  Assert.assertEquals(exp_title, act_title);
	  
	  //condition along with assertion makes test fails if it is not equal passes if it is equals.
	  if(exp_title.equals(act_title)) {
		  System.out.println("Test Passed");
		  Assert.assertTrue(true);
	  }else {
		  System.out.println("Test Failed");
		  Assert.assertTrue(false);
	  }
  }
}
