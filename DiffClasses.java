package ui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DiffClasses {

	public class classessDiff {

		@BeforeTest
		public void demoBefore() {
			System.out.println("Run before other class");
		}

		@BeforeGroups(value = "regression")
		public void beforeGroup() {
			System.out.println("Run this method before regression");
		}

		@AfterGroups(value = "regression")
		public void afterGroup() {
			System.out.println("Run this method after regression");
		}

		@Test(priority = 1, groups = "regression")
		public void group1()

		{
			System.out.println("Test1");
		}

		@Test
		public void loginTest() {

			System.out.println("Login is successful Enjoy");
		}

		@AfterClass
		public void demoAfter() {
			System.out.println("Run after other class");
		}

	}
}
