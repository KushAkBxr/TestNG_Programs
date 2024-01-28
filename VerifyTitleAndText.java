package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitleAndText {

	@Test
	public void titleAndTest() {

		SoftAssert softassert = new SoftAssert();

		System.setProperty("webdriver.gecko.driver", "C:\\browserspath\\geckodriver.exe");
		String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expectedText = "Search";
		// Create a new instance of the ChromeDriver
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		String actualTitle = driver.getTitle();
		String actualText = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		softassert.assertEquals(actualTitle, expectedTitle);
		softassert.assertEquals(actualText, expectedText, "Text verification failed");
		driver.close();
		softassert.assertAll();
	}
}
