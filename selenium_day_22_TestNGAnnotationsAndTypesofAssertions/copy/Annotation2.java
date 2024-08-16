package selenium_day_22_TestNGAnnotationsAndTypesofAssertions.copy;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class Annotation2 {
	
@Test
void abc() {
	System.out.println("this is xyz from Annotation 2 ..");
}

@AfterTest
void at() {
	System.out.println("this is after test method...");
}

}
