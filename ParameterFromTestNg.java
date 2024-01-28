package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterFromTestNg {

	// public static WebDriver driver;
	@Parameters({ "browser" })
	@Test
	public void launchApplication(String browser) {

		System.setProperty("webdriver.gecko.driver", "C:\\browserspath\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https:\\www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
		driver.close();
	}
}
