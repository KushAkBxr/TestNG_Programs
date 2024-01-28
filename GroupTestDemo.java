package ui;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.CommonDataSetup;

@Test(groups = "user-registration")
// This is used for total test cases run as a group(user-registration).
public class GroupTestDemo extends CommonDataSetup {

	@BeforeClass
	public void demoBefore() {
		System.out.println("Run before other class");
	}

	@Test(priority = 1, groups = "regression")
	public void group1() {

		System.out.println("Test1");
	}

	@Test(priority = 2, groups = "regression")
	public void group2() {
		System.out.println("Test2");
	}

	@Test(priority = 3, groups = { "regression", "bvt" })
	public void group3() {
		System.out.println("Test3");
	}

	@Test(groups = "bvt")
	public void group4() {
		System.out.println("Test4");
	}
}
