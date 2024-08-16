package selenium_day22_TestNGAnnotationsAndTypesofAssertions.copy;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class Annotation1 {
	
 @Test
 void abc() {
	 System.out.println("this is abc from Annotation1 ....");
 }
 
 @BeforeTest
 void bt() {
	 System.out.println("this is before test method.....");
 }
 
}
