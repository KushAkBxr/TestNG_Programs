package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleTest {

	@Test
	public void titleTest() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\browserspath\\geckodriver.exe");
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		// Create a new instance of the ChromeDriver
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle);

		driver.close();

	}
}
