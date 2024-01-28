package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.CommonDataSetup;

public class LoginTest extends CommonDataSetup {

	@BeforeTest
	// This will execute before running the test method.
	public void loginToApplication() {
		System.out.println("Login to Application");
	}

	@AfterTest
	// This will execute after running the test method.
	public void loginOutApplication() {
		System.out.println("Logout to Application");
	}

	@BeforeMethod
	public void ConnectToDB() {
		System.out.println("Connected to DB");
	}

	@AfterMethod
	public void disconnectToDB() {
		System.out.println("DisConnected to DB");
	}

	@Test(priority = 1, description = "This is for login test")
	public void loginTest() {

		System.out.println("Login is successful Enjoy");
	}

	@Test(priority = 2, description = "This is for logout test")
	public void logOut() {
		System.out.println("Logout is successful Enjoy");
	}
}
