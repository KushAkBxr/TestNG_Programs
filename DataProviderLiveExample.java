package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderLiveExample {

	@Test(dataProvider = "create")
	public void test(String username, String password) {
		System.out.println(username + "=======" + password);

		System.setProperty("webdriver.gecko.driver", "C:\\browserspath\\geckodriver.exe");

		// Create a new instance of the ChromeDriver
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		driver.close();

	}

	@DataProvider(name = "create")
	public Object[][] data() {
		return new Object[][] { { "standard_user", "secret_sauce" }, { "locked_out_user", "secret_sauce" },
				{ "problem_user", "secret_sauce" }, { "performance_glitch_user", "secret_sauce" },
				{ "error_user", "secret_sauce" }, { "visual_user", "secret_sauce" } };
	}

}
