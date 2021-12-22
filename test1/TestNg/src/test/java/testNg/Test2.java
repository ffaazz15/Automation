package testNg;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//BeforeTest and AfterTEST && beforeMethod and afterMethod

/***
 *      beforeTest
 *           |
 *      beforeMethod
 *           |
 *      execution based on priority
 *           |
 *      Normal Test execution
 * 
 * 
 * 
 */



public class Test2 {

	@AfterMethod
	public void sixth() {
		System.out.println("hey im sixth and also may be last");
	}
	
	
	
	@BeforeTest
	public void first() {
		System.out.println("hey iam 1st person");
	}

	
	@Test(priority=2)
	public void Second() {
		System.out.println("hey iam 2nd person");
	}

	@AfterTest(description="ill be executing aftermethod")
	public void Third() {
		System.out.println("hey iam 3rd person");
	}

	
	@Test(priority=1,description="ill be executing first")
	public void Fourth() {
		System.out.println("hey iam 4th person");
	}
	
	@BeforeMethod
	public void Fifth() {
		System.out.println("hey fazil im 5th");
	}

}
