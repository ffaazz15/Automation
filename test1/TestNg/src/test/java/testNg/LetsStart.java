package testNg;

///@Test - priority - description



import org.testng.annotations.Test;

public class LetsStart {

	@Test(priority=2,description="you can give description to this method")
	public void start() {

		System.out.println("hey fazil");

	}
	@Test(priority=4)
	public void second() {
		System.out.println("hey im 2nd person");
	}
	
	@Test(priority=5)
	public void Third() {
		System.out.println("hey im 3rd person");
	}
	
	@Test(priority=3,description="hey fazil iam gonna run 4th person in priority 3")
	public void fourth() {
		System.out.println("hey im 4th person");
	}
	
	@Test(priority=1)
	public void Fifth() {
		System.out.println("hey im 5th person");
	}

}