package selenium_day21_TestNG_TestAnnotation;

import org.testng.annotations.Test;

/*
 1) Open app
 2) Login
 3) Logout
 
 */

public class FirstTestCase {
	// 1. TestNg execute methods based on alphabetical order
	
//	@Test
//	void openapp() {
//		System.out.println("opening application .............");
//	}
//	@Test
//	void login() {
//		System.out.println("Login to application.............");
//	}
//	@Test
//	void logout() {
//		System.out.println("Logout from application ..........");
//	}
	
	
	//2. @Test(priority=num) controls the order of execution.
	
//	@Test(priority=1)
//	void openapp() {
//		System.out.println("opening application .............");
//	}
//	@Test(priority=2)
//	void login() {
//		System.out.println("Login to application.............");
//	}
//	@Test(priority=3)
//	void logout() {
//		System.out.println("Logout from application ..........");
//	}
	
	
	//3)Once you provide priority to the test methods , then order of the methods is not considered.

//	@Test(priority=3)
//	void logout() {
//		System.out.println("Logout from application ..........");
//	}
//	@Test(priority=1)
//	void openapp() {
//		System.out.println("opening application .............");
//	}
//	@Test(priority=2)
//	void login() {
//		System.out.println("Login to application.............");
//	}
	
	// 4) Priorities can be random numbers (no need to have consecutive numbers)
	
//	@Test(priority=50)
//	void logout() {
//		System.out.println("Logout from application ..........");
//	}
//	@Test(priority=10)
//	void openapp() {
//		System.out.println("opening application .............");
//	}
//	@Test(priority=25)
//	void login() {
//		System.out.println("Login to application.............");
//	}
	
	//5) If you don't provide priority then default value is zero(0).
	
//	@Test(priority=2)
//	void logout() {
//		System.out.println("Logout from application ..........");
//	}
//	@Test
//	void openapp() {
//		System.out.println("opening application .............");
//	}
//	@Test(priority=1)
//	void login() {
//		System.out.println("Login to application.............");
//	}
//	
	
	//6) If the priorities are same then again execute methods in same alphabetical order.
	
//	@Test(priority=2)
//	void logout() {
//		System.out.println("Logout from application ..........");
//	}
//	@Test
//	void openapp() {
//		System.out.println("opening application .............");
//	}
//	@Test(priority=2)
//	void login() {
//		System.out.println("Login to application.............");
//	}
	
	//7)Negative values are allowed in priority
//	@Test(priority=1)
//	void logout() {
//		System.out.println("Logout from application ..........");
//	}
//	@Test(priority=-1)
//	void openapp() {
//		System.out.println("opening application .............");
//	}
//	@Test(priority=0)
//	void login() {
//		System.out.println("Login to application.............");
//	}
	
	
	//8)TestNG will only execute test method only if they are having @Test annotation	
	
	@Test(priority=2)
	void logout() {
		System.out.println("Logout from application ..........");
	}
	void openapp() {
		System.out.println("opening application .............");
	}
	@Test(priority=2)
	void login() {
		System.out.println("Login to application.............");
	}
	
	

}
