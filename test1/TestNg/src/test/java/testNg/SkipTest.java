package testNg;

import org.testng.annotations.Test;

public class SkipTest {
	@Test
	public void atest() {
		System.out.println("a");
	}

	@Test
	public void btest() {
		System.out.println("b");
	}

	@Test(enabled = false)
	public void ctest() {
		System.out.println("c");
	}

	@Test(description = "the test c will skip")
	public void dtest() {
		System.out.println("d");
	}

}
