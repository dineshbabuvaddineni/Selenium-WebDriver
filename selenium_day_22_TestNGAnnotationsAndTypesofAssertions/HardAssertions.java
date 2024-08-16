package selenium_day_22_TestNGAnnotationsAndTypesofAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
  @Test
  public void test() {
	  //Assert.assertEquals("xyz", "xyz"); //passed
	  //Assert.assertEquals(123, 345);     //Failed
	  
	  //Assert.assertEquals("xyz", 123);   //Failed
	  //Assert.assertEquals("123", 123);   //Failed
	  
	  //Assert.assertNotEquals(123,123);    //failed
	  //Assert.assertNotEquals(123,345);   //passed
	  
	  //Assert.assertTrue(true);  //pass
	  //Assert.assertTrue(false); //failed
	  
	  // Assert.assertTrue(1==2);  //failed
	  // Assert.assertTrue(1==1);  //passed
	  
	  //Assert.assertFalse(1==2); //passed
	  //Assert.assertFalse(1==1); //failed
	  
	  Assert.fail();
	    
  }
}
