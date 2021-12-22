package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;


/*
 *   here we will learn before/after class and before/after groups
 */
@Test
public class beforeclass {
	
	@BeforeClass
	public void atest() {
		System.out.println("test 1a");
	}
	@AfterClass
	public void btest() {
		System.out.println("test 2b");
	}
	
	@Test(groups="blue group")
	public void ctest() {
		System.out.println("test 3c");
	}
	@Test(groups="red group")
	public void dtest() {
		System.out.println("test 4d");
	}
	@Test(groups="blue group")
	public void etest() {
		System.out.println("test 5e");
	}
	
	@BeforeGroups(value ="red group")
	public void beforeGroup() {
		System.out.println("this will test before any group");
	}
	
	
	public void aftergroup() {
		
	}
}
