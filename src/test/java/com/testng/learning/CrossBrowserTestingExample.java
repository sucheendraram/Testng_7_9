package com.testng.learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestingExample {
	WebDriver driver;

	@BeforeMethod
	@Parameters({ "browser" })
	public void beforeMethod(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
	}

	@Test
	public void testCase1() {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(2000);
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			Thread.sleep(2000);
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("logout_sidebar_link")).click();
			Thread.sleep(2000);
			driver.quit();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
