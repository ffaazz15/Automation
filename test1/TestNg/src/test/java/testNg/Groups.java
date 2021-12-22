package testNg;

import org.testng.annotations.Test;
/*
 * In run configuration check the actual group which you want and the run 
 * 
 * 
 * 
 * here in this example u can either run blue or red
 */

@Test(groups="user-registration") //can make group to class level too then add groups to test multiple groups
public class Groups {

	public void atest() {
		System.out.println("a");
	}

	public void btest() {
		System.out.println("b");
	}

	public void ctest() {
		System.out.println("c");
	}

	public void dtest() {
		System.out.println("d");
	}

}

