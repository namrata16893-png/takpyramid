package testng;

import org.testng.annotations.Test;

public class Demo4 {
	@Test(dependsOnGroups = "Sample")
	public void Test1() {
		System.out.println("Test 1");
	}
	@Test(groups="Sample")
	public void Test2() {
		System.out.println("Test 2");
	}
	@Test(groups="Sample")
	public void Test3() {
		System.out.println("Test 3");
	}
	@Test(groups="Sample")
	public void Test4() {
		System.out.println("Test 4");
	}
	@Test(groups="Sample")
	public void Test5() {
		System.out.println("Test 5");
	}

}
